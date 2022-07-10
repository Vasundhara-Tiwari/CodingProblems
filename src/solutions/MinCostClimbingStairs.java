public class MinCostClimbingStairs{
  public int minCostClimbingStairs(int[] cost) {
    for (int i = 2; i < cost.length; i ++) {
      cost[i] += Math.min(cost[i - 1], cost[i - 2]);
    }
  }
}
