public class NonRepeatingChar {
    public String non_repeated( String str) {
        for(int i = 0;i<str.length();i++) {
            int count=0;
            for(int j = 0;j<str.length();j++) {
                if(str.charAt(j) == str.charAt(i));
                count += 1;
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        String sttr = "This is a statemenet";
        int result = non_repeated(str);
        System.out.println(result);
    }
    
}
