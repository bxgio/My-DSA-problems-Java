public class Stockprice {

    public static void main(String[] args) {
        int []arr = {3,5,6,9,8,78};
        int p = pick(arr);
        System.out.println(p);
    }
    public static int pick(int []prices) {
        int minprice = prices[0];
        int maxprofit = 0;
        for(int i =0;i <prices.length;i++){
            int currentprice =prices[i];
            int currentprofit = currentprice - minprice;
            if(currentprofit >maxprofit){
                maxprofit=currentprofit;
            } if(currentprofit<maxprofit){
                minprice = currentprice;
            }
        }return maxprofit;
    }
}