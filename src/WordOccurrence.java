import java.io.*;
import java.util.*;
public class WordOccurrence {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        HashMap<String,Integer> map= new HashMap<>();
        File file = new File("C:\\Users\\mounika.gaddamuri\\Documents\\Assignments\\Assignment5\\src\\text");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st,str="";
        while ((st = br.readLine()) != null)
            str+=st;
        str=str.toLowerCase();
        String[] words=str.split(" ");
        for(int i=0;i< words.length;i++){
            if(map.containsKey(words[i]))
                map.put(words[i],map.get(words[i])+1);
            else
                map.put(words[i],1);
        }
        System.out.println(map);
    }
}
