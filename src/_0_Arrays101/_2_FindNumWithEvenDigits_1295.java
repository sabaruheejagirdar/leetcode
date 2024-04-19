package _0_Arrays101;

public class _2_FindNumWithEvenDigits_1295 {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,786};
        System.out.println("Result:"+findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int evenNumberCount = 0;
        for(int num: nums){
            int lengthOfNum = String.valueOf(num).length();
            if(lengthOfNum %2 == 0){
                evenNumberCount++;
            }
        }

        return evenNumberCount;
    }
}
