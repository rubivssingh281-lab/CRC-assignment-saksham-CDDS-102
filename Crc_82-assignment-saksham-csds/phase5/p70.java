class p70 {
    static String rev(String s){
        if (s == null || s.isEmpty()){
            return "";
        }
        return rev(s.substring(1)) +s.charAt(0);
    }
    public static void main(String[] args){
        String sentence = "Hello World";
        System.out.println("Original: "+sentence);
        String reversed = rev(sentence);
        System.out.println("Reversed: "+reversed);
    }
}
