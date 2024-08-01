import java.util.*;
public class Intersection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first array size: ");
        int array1_size = input.nextInt();
        int[] array1 = new int[array1_size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<array1_size;i++)
            array1[i]=input.nextInt();

        System.out.println("Enter second array size: ");
        int array2_size = input.nextInt();
        int[] array2 = new int[array2_size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<array2_size;i++)
            array2[i]=input.nextInt();

        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<array1_size;i++){
            for(int j=0;j<array2_size;j++){
                if(array1[i]==array2[j]){
                    map.put(array1[i],true);
                }
            }
        }
        for(Map.Entry<Integer,Boolean> m: map.entrySet())
            System.out.println(m.getKey());

    }

}
