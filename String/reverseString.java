public class reverseString{
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        String reversed = "";
        for(int i=chars.length-1;i>=0;i--) {
            reversed = reversed + chars[i];
        }
        return reversed;
    }
    public static void main(String[] args) {
        String input="REVERSED";
        String result = reverse(input);
        System.err.println(result);
    }
}