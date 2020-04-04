public class DayFour {

    public static void main (String ar[])
    {
        int arr[] = {0,1,0,3,12};
        int n = arr.length;
        int count = 0;
        int temp = 0;

        for(int i=0; i<n; i++)
        {
            if(arr[i] != 0)
            {
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

        for(int i=0; i<n; i++)
            System.out.println(arr[i]+" ");

    }

}
