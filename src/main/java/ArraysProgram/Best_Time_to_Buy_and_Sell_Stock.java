package ArraysProgram;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int [] arr = {7, 1, 5, 3, 6, 4};;

        System.out.println(m1(arr));
    }

    public static  int m1(int [] arr){

        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;


        for(int x : arr) {
            if(x < minBuy) {
                minBuy = x;
            }
            int profit = x - minBuy;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
            return maxProfit ;
    }
}
