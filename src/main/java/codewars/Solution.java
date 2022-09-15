package codewars;

public class Solution {


    public static void main(String[] args) {
        printZeros(4,4);
      parsePhoneNumber("1234567890");
      characterVal("An example");
      printWord("Hello world!");

    }

    public static void printZeros(int row, int col){
        /**
         * [
         * [2,2],
         * [2,2]
         * ]
         *
         */
        for(int i =0; i < row;i++){
            for(int j=0; j < col; j++) {
                System.out.print("O");
            }
            System.out.println();
    }}

    static void parsePhoneNumber(String number){
        String prefix = number.substring(0,3);
        String mid = number.substring(4,7);
        String end = number.substring(7);
        String parsed = "("+prefix+") " + mid + "-" + end;
        System.out.println(parsed);
    }


    static void characterVal(String word){
        int sum = 0;
        for(char x : word.toCharArray()){
            sum += x;
        }
        System.out.println(sum);
    }

    static void printWord(String word){
       printLines(word.length());
        System.out.println();
        System.out.print("* " + word + " *");
        System.out.println();
       printLines(word.length());
    }
    static void printLines(int len){
        for(int i = 0;i < len + 4;i++) {
            System.out.print("*");
        }
    }


}



