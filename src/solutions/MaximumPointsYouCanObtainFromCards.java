public class MaximumPointsYouCanObtainFromCards{
  public int maxScore(int[] cardPoints, int k) {
         int n = cardPoints.length, maximumScore = 0, leftSum = 0, rightSum = 0;
         for(int i = 0; i < k; i++) 
           leftSum += cardPoints[i];
         if(k == n) return leftSum;
           maximumScore = Math.max(maximumScore, leftSum);
         for(int i = 0; i < k; i++){
           leftSum -= cardPoints[k - i - 1];
           rightSum += cardPoints[n - i - 1];
           maximumScore = Math.max(maximumScore, leftSum + rightSum);
          }
         return maximumScore;
    }
}
