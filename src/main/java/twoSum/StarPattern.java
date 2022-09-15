package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StarPattern {


    /**
     *
     * Input: arr = [3,3,3,3,5,5,5,2,2,7]
     * Output: 2
     * Explanation: Choosing {3,7} will make the new array [5,5,5,2,2]
     * which has size 5 (i.e equal to half of the size of the old array).
     * Possible sets of size 2 are {3,5},{3,2},{5,2}.
     * Choosing set {2,7} is not possible as it will make the new array [3,3,3,3,5,5,5]
     * which has a size greater than half of the size of the old array.
     *
     *
     *
     * @param args
     */

    public static void main(String[] args) {
        System.out.println(minSetSize(new int[]{3,3,3,3,5,5,5,2,2,7}));
        }


    public static int minSetSize(int[] arr) {
        HashMap<Integer,Integer> minSet = new HashMap<>();
        for(int i=0;i<arr.length;i++)
            minSet.put(arr[i],minSet.getOrDefault(arr[i],0)+1);
        int[] a =new int[minSet.size()];
        int i=0;
        for (Map.Entry<Integer, Integer> set :minSet.entrySet()){
            a[i++]=set.getValue();
        }
        Arrays.sort(a);

        int s=0;
        for(i=minSet.size()-1;i>=0;i--){
            if(s>=(arr.length/2))
                break;
            else
                s+=a[i];
        }
        return minSet.size()-i-1;
    }
}
