class SequentialDigits {
   public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        for(int i=1; i<=9; i++){
            findSequentialDigits(i,low,high,result);
        }
        Collections.sort(result);
        return result;
   }
   public static void findSequentialDigits(int current, int low, int high, List<Integer> result){
      
    }
}
