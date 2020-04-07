import java.util.ArrayList;

class DayRage{

    int buy, sell;
}

public class DayFive {

    public int maxProfit(int price[])
    {
        int n = price.length;
        // Prices must be given for at least two days
        if (n == 1)
            return 0;

        int count = 0;
        int finalProfit = 0;

        // solution array
        ArrayList<DayRage> profitDays = new ArrayList<DayRage>();

        // Traverse through given price array
        int i = 0;
        while (i < n - 1) {
            // Find Local Minima. Note that the limit is (n-2) as we are
            // comparing present element to the next element.
            while ((i < n - 1) && (price[i + 1] <= price[i]))
                i++;

            // If we reached the end, break as no further solution possible
            if (i == n - 1)
                return 0;

            DayRage range = new DayRage();
            range.buy = i++;
            // Store the index of minima

            // Find Local Maxima.  Note that the limit is (n-1) as we are
            // comparing to previous element
            while ((i < n) && (price[i] >= price[i - 1]))
                i++;

            // Store the index of maxima
            range.sell = i - 1;
            profitDays.add(range);

            // Increment number of buy/sell
            count++;
        }

        // print solution
        if (count == 0)
            return 0;

        else {
            for (int j = 0; j < count; j++)
            {
                System.out.println("Buy on day: " + profitDays.get(j).buy
                        + "        "
                        + "Sell on day : " + profitDays.get(j).sell);
                finalProfit = finalProfit + (price[profitDays.get(j).sell] - price[profitDays.get(j).buy]);
                //System.out.println(finalProfit);
            }

            return finalProfit;
        }
    }

    public static void main(String args[])
    {
        DayFive stock = new DayFive();

        // stock prices on consecutive days
        int price[] = { 7,1,5,3,6,4 };

        // function call
        //stock.stockBuySell(price, n);
        System.out.println(stock.maxProfit(price));

    }

}
