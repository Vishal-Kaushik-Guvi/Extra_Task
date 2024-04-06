public class GreatString {

    public String makeGood(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (result.length() > 0 && Math.abs(result.charAt(result.length() - 1) - c) == 32) {
                result.deleteCharAt(result.length() - 1); // Remove the last character
            } else {
                result.append(c); // Add the character to the result
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "VvisShHal";
        GreatString gs =new GreatString();
        String result =  gs.makeGood(s);
        System.out.println(result);
    }
}
