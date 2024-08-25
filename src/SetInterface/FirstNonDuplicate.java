package SetInterface;
import java.util.*;

public class FirstNonDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
        Integer firstNonDuplicate = findFirstNonDuplicate(numbers);

        if (firstNonDuplicate != null) {
            System.out.println("First non-duplicate element: " + firstNonDuplicate);
        } else {
            System.out.println("No non-duplicate element found.");
        }
    }

    public static Integer findFirstNonDuplicate(List<Integer> list) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (Integer num : list) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }
}
