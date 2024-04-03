public class Palindrome { 
    public static boolean isPalindrome(int x) {
        int reverse = 0;
        while(x != reverse){
            x = x%10;
            reverse = reverse*10+x;
            x = x/10;
        }
        if(x == reverse){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
      int x = 20;
      boolean result = isPalindrome(x);
      System.out.println(result);
  }
}