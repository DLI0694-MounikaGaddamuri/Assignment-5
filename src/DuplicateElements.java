import java.util.*;
public class DuplicateElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.println("Enter the array size:");
        int array_size=input.nextInt();
        int[] array = new int[array_size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array_size;i++)
            array[i]=input.nextInt();
        for(int i=0;i<array_size;i++){
            if(map.containsKey(array[i]))
                map.put(array[i],map.get(array[i])+1);
            else
                map.put(array[i],1);
        }
        System.out.println("Duplicate elements are: ");
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue()>1)
                System.out.println(m.getKey());
        }

    }
}
