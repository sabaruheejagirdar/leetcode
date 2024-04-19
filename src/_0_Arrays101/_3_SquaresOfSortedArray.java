package _0_Arrays101;
import java.util.Arrays;
public class _3_SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println("Result:"+Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] sortedSquare = new int[nums.length];
        for(int  i=0; i<sortedSquare.length; i++){
            sortedSquare[i] = nums[i] * nums[i];
        }
        Arrays.sort(sortedSquare);
//        System.out.println(Arrays.toString(sortedSquare));
        return sortedSquare;
    }
}
