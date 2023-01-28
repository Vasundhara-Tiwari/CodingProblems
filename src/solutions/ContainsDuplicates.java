import java.util.HashSet;
public class ContainsDuplicates{
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> al = new HashSet<>();
        for(int i: nums){
            if(!al.contains(i)){
                al.add(i);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
