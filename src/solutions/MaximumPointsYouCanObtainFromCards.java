public class MaximumPointsYouCanObtainFromCards{
  public int maxScore(int[] cardPoints, int k) {
         int n = cardPoints.length, maximumScore = 0, leftSum = 0, rightSum = 0;
         for(int i = 0; i < k; i++) 
           leftSum += cardPoints[i];
         return maximumScore;
    }
}
