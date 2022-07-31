import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> res= removeOddEIndexElements(list);
        System.out.println(res);
    }

    private static List<Integer> removeOddEIndexElements(ArrayList<Integer> list) {

        Iterator<Integer> iterator= list.iterator();
        int i=0;
        while (iterator.hasNext())
        {
            if (i%2==1) {
                Integer element = iterator.next();
                list.remove(element);
            }
            i++;
        }
        return list;
    }
}
