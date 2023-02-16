package codewars;

public class TextCompressor {

    public static void main(String[] args) {

    }
    public static String textCompressor(String text) {
        char chars[] = text.toCharArray();
        char current = chars[0];
        int count = 1;
        StringBuilder sb = new StringBuilder(100);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == current) {
                count++;
            } else {
                sb.append(current + "" + count);
                current = chars[i];
                count = 1;
            }
        }
        sb.append(current + "" + count);

        return sb.toString();
    }
}
