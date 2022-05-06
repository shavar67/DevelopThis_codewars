package twoSum;


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



    public int [] solution(int array [], int target){
        int [] result = new int[2];
        for(int i =0; i < array.length-1;i++){
            for(int j = 0; j < array.length-1;j++){
                if(array[i] + array[j] == target){
                    result[0] = array[i];
                    result[1] = array[j];
                }
            }
        }
        return result;
    }





}
