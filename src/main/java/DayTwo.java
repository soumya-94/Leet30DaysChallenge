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

    static boolean isHappy(int n)
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
        int n = 19;
        if(isHappy(n))
            System.out.println(n + " is a happy number.");
        else
            System.out.println(n + " is not a happy number.");
    }


}
