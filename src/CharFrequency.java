import java.util.*;
public class CharFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
       String str=input.nextLine();

        List<Integer> list = new ArrayList<>();
        char[] charArray= str.toCharArray();
        int count;
        for(int i=0;i<str.length();i++) {
            count=1;
            if(charArray[i]!='\u0000') {
                for (int j = i + 1; j < str.length(); j++) {
                    if (charArray[i] == charArray[j]) {
                        charArray[j] = '\u0000';
                        count++;
                    }
                }
            }
            list.add(count);
        }

        for(int i=0;i<str.length();i++){
            if(charArray[i]!='\u0000')
                System.out.println(str.charAt(i)+"->"+list.get(i));
        }

    }
}

