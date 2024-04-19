package _1_Arrays_Hashing;

/*STRATEGY:

Example1
Input: nums = [1,2,3,1]
Output: true

Example2
Input: nums = [1,2,3,4]
Output: false

* 1. Create a HashSet to keep track of visited elements
* 2. If element exists in the HashSet, return true
        Else, add the element to the HashSet
* 3. All elements traversed and no duplicate found in HashSet, return false
* */


import java.util.HashSet;

public class _1_ContainsDuplicate_217 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<Integer>();

        for(int i = 0; i<nums.length; i++){
            if(numSet.contains(nums[i])){
                return true;
            }
            numSet.add(nums[i]);
        }
        return false;
    }
}