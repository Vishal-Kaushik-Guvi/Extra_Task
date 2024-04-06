public class ValidParanthesis {

    public int maxDepth(String s) {
        int count=0;
        int maxdepth=0;
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(') {
                   count++;
                   maxdepth = Math.max(maxdepth, count);
              }else if(s.charAt(i) == ')'){
                count--;
              }
        }
        return maxdepth;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        ValidParanthesis vp =new ValidParanthesis();
        int result = vp.maxDepth(s);
        System.out.println(result);
    }
}
