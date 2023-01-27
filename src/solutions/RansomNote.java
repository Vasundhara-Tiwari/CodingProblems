public class RansomNote{
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            int index = magazine.indexOf(ch);
            if(index == -1){
                return false;
            }
            magazine = magazine.substring(0, index) + magazine.substring(index+1);
        }
        return true;
    }
}
