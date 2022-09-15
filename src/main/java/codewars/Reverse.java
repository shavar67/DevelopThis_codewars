package codewars;

public class Reverse {


    public static void main(String[] args) {
        String phoneNumber = "6672563622";
        System.out.println(reversePhoneNumber(phoneNumber));
        System.out.println(textCompressor("aabbccc"));

        System.out.println(decompressText("a2y3b1w4"));
    }


    public static String reversePhoneNumber(String number) {
        char[] numbers = new char[number.length()];
        StringBuilder sb = new StringBuilder();
        for (int currentCharacter = numbers.length - 1;
             currentCharacter >= 0; currentCharacter--) {
            numbers[currentCharacter] = number.charAt(currentCharacter);
            sb.append(numbers[currentCharacter]);
        }
        return sb.toString();
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

    public static String decompressText(String text){
        String characters [] = text.split("(?<=\\d)");
       String word = "";
        for (int i = 0, charactersLength = characters.length; i < charactersLength; i++) {
            String character = characters[i];
            for (int j = 0; j < Integer.parseInt(String.valueOf(character.charAt(1))); j++) {
                word += character.charAt(0);
            }
        }
        return word;
    }
}









