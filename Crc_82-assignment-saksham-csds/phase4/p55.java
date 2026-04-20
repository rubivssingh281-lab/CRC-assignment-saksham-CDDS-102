public class p55 {
    public static void main(String[] args) {
        String str = "Hello World 123";

        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }
            // Check digits
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            // Check spaces
            else if (ch == ' ') {
                spaces++;
            }
            // Check consonants (alphabets except vowels)
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}
