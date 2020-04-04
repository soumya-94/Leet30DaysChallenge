public class DayOne {

    public static void main (String ar[])
    {
        int a[] = {4, 1, 2, 1, 2};
        int result = 0;

        for (int i=0; i<a.length; i++)
        {
            result = result ^ a[i];
        }

        System.out.println("The single number in the array is " + result);
    }

}
