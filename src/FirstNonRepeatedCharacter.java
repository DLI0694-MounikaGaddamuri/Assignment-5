import java.util.*;
public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        String str = input.nextLine();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            else
                map.put(str.charAt(i),1);
        }
        for(Map.Entry<Character,Integer> m: map.entrySet()){
            if(m.getValue()==1){
                System.out.println(m.getKey());
                break;
            }
        }
    }
}
