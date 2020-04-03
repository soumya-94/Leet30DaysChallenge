public class DayTwo {

    static int sumOfSquares(int n)
    {
        int sum = 0;
        while(n!=0)
        {
            sum = sum + ((n%10)*(n%10));
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n)
    {
        int slow, fast;
        slow = fast = n;

        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        return (slow == 1);

    }
    
    public static void main (String ar[])
    {
        System.out.println(sumOfSquares(19));
    }


}
