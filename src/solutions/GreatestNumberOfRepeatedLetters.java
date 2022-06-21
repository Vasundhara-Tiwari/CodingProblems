public class GreatestNumberOfRepeatedLetters{
  public static void main (String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();
        scanner.close();
        System.out.print(searchingChallenge(str));
    }
  public static String greatestRepeatedCharWord(String str) {
        String challengeToken = "grdxcz850";
        int maxChar = 0;
        String result = "";
        final String[] words = str.split("\\s+");
        for (final String word : words) {
            final int c = mostFrequentCharCount(word);
            if (c > maxChar) {
                maxChar = c;
                result = word;
            }
        }
        result += challengeToken;
        String finaloutput = "";
        for(int i = 0; i < result.length(); i++){
            if(i%3 == 2){
                finaloutput += "X";
            }
            else {
                finaloutput += result.substring(i, i + 1);
            }
        }
        
        return finaloutput;
    }
}
