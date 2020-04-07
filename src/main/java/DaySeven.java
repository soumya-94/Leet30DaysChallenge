import javax.sound.midi.SysexMessage;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class DaySeven {

    public static int countElements(int arr[])
    {
        HashSet<Integer> elements = new HashSet<Integer>();
        int count = 0;

       for(int i=0; i<arr.length; i++)
           elements.add(arr[i]);

       System.out.println(elements);

       for (int i=0; i<arr.length; i++)
           if(elements.contains(arr[i]+1))
               count++;

       return count;
    }

    public static void main(String ar[])
    {
        int arr[] = {1,1,2,2};
        int answer = countElements(arr);
        System.out.println(answer);
    }

}
