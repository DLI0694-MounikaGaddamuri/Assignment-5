import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PolicyManager {

    HashMap<String, Policy> hashMap = new HashMap<>();
    LinkedHashMap<String, Policy> linkedHashMap = new LinkedHashMap<>();
    TreeMap<String, Policy> treeMap = new TreeMap<>();

    //Policy p = new Policy();

    public void addPolicy(Scanner input) {
        System.out.println("Enter policy number: ");
        String policy_number = input.nextLine();
        System.out.println("Enter holder name: ");
        String holder_name = input.nextLine();
        System.out.println("Enter coverage type: ");
        String coverage_type = input.nextLine();
        System.out.println("Enter the premium amount: ");
        long premium_amount = input.nextLong();
        input.nextLine();
        System.out.println("Enter the expiry date: ");
        String date = input.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date expiry_date;
        try {
            expiry_date = sdf.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        hashMap.put(policy_number, new Policy(policy_number, premium_amount, holder_name, coverage_type, expiry_date));
        linkedHashMap.put(policy_number, new Policy(policy_number, premium_amount, holder_name, coverage_type, expiry_date));
        treeMap.put(policy_number, new Policy(policy_number, premium_amount, holder_name, coverage_type, expiry_date));
    }

    public Policy getPolicyByNumber(String required_policy) {
        return hashMap.get(required_policy);
    }

    public List<Policy> getExpiringPolicies() {
        List<Policy> expiringPolicies = new ArrayList<>();
        Date present = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(present);
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date afterThirtyDays = cal.getTime();

        present = normalizeDate(present);
        afterThirtyDays = normalizeDate(afterThirtyDays);

        for (Policy p : treeMap.values()) {
            Date expiryDate = normalizeDate(p.getExpiry_date());
            if (expiryDate.before(afterThirtyDays) && expiryDate.after(present)) {
                expiringPolicies.add(p);
            }
        }
        return expiringPolicies;
    }

    private Date normalizeDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    //    public void removeExpiredPolicies() {
//        List<Policy> expiringPolicies = new ArrayList<>();
//        Date present = new Date();
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(present);
//        cal.add(Calendar.DAY_OF_YEAR, 30);
//        Date afterThirtyDays = cal.getTime();
//
//        present = normalizeDate(present);
//        afterThirtyDays = normalizeDate(afterThirtyDays);
//
//        for (Policy p : treeMap.values()) {
//            Date expiryDate = normalizeDate(p.getExpiry_date());
//            if (expiryDate.before(present)) {
//                treeMap.remove(p.getPolicy_number());
//            }
//        }
//        System.out.println("hii");
//        System.out.println(treeMap);
//    }
//}
    public void removeExpiredPolicies() {
        Date present = new Date();
        present = normalizeDate(present);
        List<String> policiesToRemove = new ArrayList<>();

        for (Map.Entry<String, Policy> entry : treeMap.entrySet()) {
            Date expiryDate = normalizeDate(entry.getValue().getExpiry_date());
            if (expiryDate.before(present)) {
                policiesToRemove.add(entry.getKey());
            }
        }

        for (String policyNumber : policiesToRemove) {
            treeMap.remove(policyNumber);
        }
        System.out.println(treeMap);
    }
}



