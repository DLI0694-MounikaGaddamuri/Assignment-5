package SetInterface;

//public class InsertionOrder {
//}
import java.util.*;

public class InsertionOrder {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");
        LinkedHashSet<String> set = new LinkedHashSet<>(fruits);

        System.out.println("LinkedHashSet: " + set);
    }

}
