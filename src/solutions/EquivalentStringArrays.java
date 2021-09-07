class EquivalentStringArrays{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    	int length1 = sc.nextInt();
	    	int length2 = sc.nextInt();
 		String[] word1 = new String[length1];
 		String[] word2 = new String[length2];
 		for(int i=0;i<word1.length; i++){
 		    word1[i] = sc.next();
 		}
 		for(int i=0;i<word2.length; i++){
 		    word2[i] = sc.next();
 		}
 		System.out.println(arrayStringsAreEqual(word1,word2));
	}
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        	String str1 = "";
        	String str2 = "";
        	for(int i=0;i<word1.length;i++)
		{
            		str1+=word1[i];
        	}
        	for(int i=0;i<word2.length;i++)
		{
            		str2+=word2[i];
        	}
        	if(str1.equals(str2))
		{
            		return true;
        	} 
		else 
		{
            		return false;
        	}
    	}
}
