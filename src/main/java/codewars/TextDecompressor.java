package codewars;

public class TextDecompressor {

    public static void main(String[] args) {
        System.out.println(decompress("a2b1c3q9a1"));
        System.out.println(appendWords("APP","TITLE"));
    }

    public static String decompress(String text){
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
    public static String appendWords(String w,String w2){
        int len1 = Integer.parseInt(String.valueOf(w.length()));
        int len2 = Integer.parseInt(String.valueOf(w2.length()));
        String newWord = w+ w2.substring(len2-len1+1);
        return newWord;
    }




//    public static String solution(int number){
//        int indexTocheck =
//                Integer.parseInt(String.valueOf(Integer.toString(number.charAt(String.valueOf(number).length()-1))));
//        System.out.println(indexTocheck);
//        String msg = "";
//        if(isEven(number) && indexTocheck == 0)
//            msg= "Zero/even";
//        else if(!isEven(number) && indexTocheck == 5)
//            msg = "Five/Odd";
//        else if(isEven(number)){
//            msg = "Even";
//        }
//        else{
//            msg = "odd";
//        }
//        return msg;
//    }
//
//    public static boolean isEven(int number){
//
//        return number%2 ==0;
//
//    }

}
