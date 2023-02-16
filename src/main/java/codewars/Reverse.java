package codewars;

public class Reverse {


    public static void main(String[] args) {
        String phoneNumber = "6672563622";
        System.out.println(reversePhoneNumber(phoneNumber));



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




}









