package SetInterface;//package SetInterface;
//
//public class ClassSpecific {
//
//}
import java.util.*;

public class ClassSpecific {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 5, 1, 2);

        Set<Integer> hashSet = new HashSet<>(numbers);
        Set<Integer> linkedHashSet = new LinkedHashSet<>(numbers);
        Set<Integer> treeSet = new TreeSet<>(numbers);

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
