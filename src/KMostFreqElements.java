import java.util.*;

public class KMostFreqElements {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 4, 5, 2, 6, 1};
        int k=2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< array.length;i++)
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;

        List<Map.Entry<Integer, Integer> > list
                = new ArrayList<Map.Entry<Integer, Integer> >(
                map.entrySet());

        Collections.sort(
                list,
                new Comparator<Map.Entry<Integer, Integer> >() {
                    public int compare(
                            Map.Entry<Integer, Integer> o1,
                            Map.Entry<Integer, Integer> o2)
                    {
                        if (o1.getValue() == o2.getValue())
                            return o2.getKey() - o1.getKey();
                        else
                            return o2.getValue()
                                    - o1.getValue();
                    }
                });

        for (int i = 0; i < k; i++)
            System.out.print(list.get(i).getKey() + " ");
    }

}

