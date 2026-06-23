public class NonRepeatingChar {
    public char non_repeated(String str) {
        for(int i = 0;i<str.length();i++) {
            int count=0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }
            if(count == 1) {
                return str.charAt(i);   
            }
        }
         return ' ';
    }
    public static void main(String[] args) {
        String str = "aabbcd";
        NonRepeatingChar obj = new NonRepeatingChar();
        char result = obj.non_repeated(str);
        System.out.println(result);
    }
}
