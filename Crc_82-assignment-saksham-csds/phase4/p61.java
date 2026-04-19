public class p61 {

    public static void main(String[] args) {
        String str = "Hello123 @World!";
        String r = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                r = r + ch;
            }
        }

        System.out.println("Result: " + r);
    }
}
