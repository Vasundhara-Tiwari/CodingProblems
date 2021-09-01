class SequentialDigits {
   public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        for(int i=1; i<=9; i++){
            findSequentialDigits(i,low,high,result);
        }
        Collections.sort(result);
        
   }
   public static void findSequentialDigits(int current, int low, int high, List<Integer> result){
      if(current>=low && current<=high){
         result.add(current);
      }
      int digit = current%10;
      if(current>high || digit == 9){
         return;
      }
      findSequentialDigits(current*10+digit+1,low,high,result);  
    }
}
