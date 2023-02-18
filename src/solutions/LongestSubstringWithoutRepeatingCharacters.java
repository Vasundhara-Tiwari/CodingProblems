package solutions;

public class LongestSubstringWithoutRepeatingCharacters{
  public int lengthOfLongestSubstring(String s) {
        Set<Character> window=new HashSet<>();
        int start=-1;
        int end=0;
        int answer=0;
        for(int i=0;i<s.length();i++){
            window=new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(!window.contains(s.charAt(j))){
                   window.add(s.charAt(j));
                   answer=Math.max(answer, j-i+1); 
                }
                else{
                   break; 
                }
            } 
        }
        return answer;
    }
}
