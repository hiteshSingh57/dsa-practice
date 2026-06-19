public class CheckPalindrome {
    public  static Boolean isPalindrome( String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "hello";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }
    
}
