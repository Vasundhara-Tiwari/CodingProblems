public class CommonChild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] words = {str1, str2};
        System.out.println(commonChars(words));
    }
    public static int commonChars(String[] words) {

        List<String> ls=new ArrayList<>();

        int[] count=new int[26];
        Arrays.fill(count,Integer.MAX_VALUE);
        for(int i=0;i<words.length;i++){
            int[] count1=new int[26];
            for(int j=0;j<words[i].length();j++){
                count1[words[i].charAt(j)-'a']++;
            }

            for(int j=0;j<26;j++){

                count[j]=Math.min(count1[j],count[j]);
            }
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                for(int j=0;j<count[i];j++){
                    ls.add(""+(char)(i+'a'));
                }
            }
        }
        return ls.size();
    }
}
