package solutions;

public class CoinDenomination {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6};
        coinDenominationAmount(arr, 10, "");
    }
    public static void coinDenominationAmount(int[] coins, int amount, String ans){

        if(amount<0){
            return;
        }
        if(amount==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<coins.length; i++){
            coinDenominationAmount(coins, amount-coins[i], ans+coins[i]);
        }
    }
}
