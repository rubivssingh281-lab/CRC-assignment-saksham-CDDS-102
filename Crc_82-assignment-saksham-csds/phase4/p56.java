public class p56 {
    public static void main(String[] args) {
        String str = "Hello World";

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            boolean x = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    x = true;
                    break;
                }
            }
            if (x)
                continue;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " : " + count);
        }
    }
}
