public class CommonChild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String[] words = {str1, str2};
        System.out.println(commonChars(words));
    }
}
