public class Palindrome { 
    public static boolean isPalindrome(int x) {
            String Str = String.valueOf(x);
            int firstNum = 0; 
            int lastNum = Str.length() - 1;
            
            while (firstNum < lastNum) {
                if (Str.charAt(firstNum) != Str.charAt(lastNum)) {
                    return false;
                }
                
                firstNum++;
                lastNum--;
            }
            
            return true;
        }
    
    public static void main(String[] args) {
      int x = 101;
      boolean result = isPalindrome(x);
      System.out.println(result);
  }
}