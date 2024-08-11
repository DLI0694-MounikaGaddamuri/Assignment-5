import java.util.*;
public class Main extends PolicyManager{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        char ch;
        Main manager = new Main();
        do {
            System.out.println("1.Add a policy");
            System.out.println("2.Retrieve a policy");
            System.out.println("3.Policies expiring within the next 30 days.");
            System.out.println("4.All policies for a specific policyholder");
            System.out.println("5.Remove expired Policies.");

            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice){
                case 1: manager.addPolicy(input);
                        break;

                case 2:
                    System.out.println("Enter the policy number:");
                    String required_policy=input.nextLine();
                    Policy p=manager.getPolicyByNumber(required_policy);
                    System.out.println(p.policy_number+" "+p.holder_name+" "+p.coverage_type+" "+p.premium_amount+" "+p.expiry_date);
                    break;

                case 3:
                    System.out.println(manager.getExpiringPolicies());
                    break;

                case 5:
                    manager.removeExpiredPolicies();
                    break;

            }
            System.out.println("Do you want to continue? then enter y else n");
            ch=input.next().charAt(0);
        }while(ch=='y');

    }
}
