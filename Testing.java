public class Testing {
    public static void main(String[] args) {
          String s = "abc";
          StringBuilder sb = new StringBuilder();

          for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i) == 'e'){
                sb.append(i);
             }
          }
          System.out.println(sb);
    }
}
