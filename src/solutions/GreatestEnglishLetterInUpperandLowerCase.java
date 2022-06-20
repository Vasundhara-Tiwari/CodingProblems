public class GreatestEnglishLetterInUpperandLowerCase{
  public String greatestLetter(String s) {
    ArrayList<Character> uppercase = new ArrayList<>();
    ArrayList<Character> lowercase = new ArrayList<>();
    ArrayList<Character> common = new ArrayList<>();
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
        lowercase.add(s.charAt(i));
      }
      else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
        uppercase.add(s.charAt(i));
      }
    }
  }
}
