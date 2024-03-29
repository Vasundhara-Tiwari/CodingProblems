package solutions;

public class MaximumWealth{
  public int maximumWealth(int[][] accounts) {
    int maxSum = 0;
    for(int i = 0; i < accounts.length; i++){
      int sum = 0;
      for(int j = 0; j < accounts[i].length; j++){
        sum += accounts[i][j];
      }
      maxSum = sum > maxSum ? sum : maxSum;
    }
    return maxSum;
  }
}
