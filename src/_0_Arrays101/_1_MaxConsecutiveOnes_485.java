package _0_Arrays101;

public class _1_MaxConsecutiveOnes_485 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println("Result:"+findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int idx = 0;
        int max = 0;
        int numberOfOnes = 0;
        while(idx < nums.length){
            if(nums[idx]==0){
                numberOfOnes = 0;
            } else if (nums[idx]==1) {
                numberOfOnes++;
            }
            if(numberOfOnes > max){
                max = numberOfOnes;
            }

            idx++;
        }
        return  max;
    }
}
