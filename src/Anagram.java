import java.util.*;
public class Anagram {

    public static boolean isAnagram(String string1,String string2){
        if(string1.length() != string2.length())
            return false;
        else{
            char[] string1Array = string1.toLowerCase().toCharArray();
            char[] string2Array = string2.toLowerCase().toCharArray();

            Arrays.sort(string1Array);
            Arrays.sort(string2Array);

            if(Arrays.equals(string1Array,string2Array))    return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String,String> map = new HashMap<>();
        System.out.println("Enter the string array size: ");
        int array_size = input.nextInt();
        input.nextLine();
        String[] array= new String[array_size];
        System.out.println("Enter strings:");
        for(int i=0;i<array_size;i++)
            array[i]=input.nextLine();
        for(int i=0;i<array_size;i++){
            for(int j=i+1;j<array_size;j++){
                if(isAnagram(array[i],array[j]))
                    map.put(array[i],array[j]);
            }
        }
        System.out.println(map);
    }
}
