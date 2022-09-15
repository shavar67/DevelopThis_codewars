package codewars;


/**
 * Return a new array containing the two numbers which the sum is equal to our target
 * int [] numbers = {1,3,0,4,8}
 * target = 7
 * expects:
 * newArray[0] = array[i]
 * newArray[1] = array[j]
 * return newArray[3,4]
 */
public class TwoSumSolution {


   /** bad solution <3 **/
    public int [] solution(int array [], int target){
        int [] result = new int[2];
        for (int i : array) {
            for (int k: array) {
                if (i + k == target) {
                    result[0] = i;
                    result[1] = k;
                }
            }
        }
        return result;
    }







}
