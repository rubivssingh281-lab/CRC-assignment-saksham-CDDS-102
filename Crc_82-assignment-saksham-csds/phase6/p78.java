class Strcomp{
    public static void main(String[] args){
        String s = "aabcccccaaa";
        System.out.println(compress(s));
    }
    static String compress(String s){
        if(s.length() == 0)
             return s;
        StringBuilder sb = new StringBuilder();
        int cnt =1;
        for (int i=1;i<=s.length();i++){
            if(i<s.length()&&s.charAt(i)==s.charAt(i-1)) 
                cnt++;
            else{
                sb.append(s.charAt(i-1));
                if(cnt>1)
                    sb.append(cnt);
                cnt =1;
            }
        }
        return (sb.length()<s.length()?sb.toString():s);
    }
}