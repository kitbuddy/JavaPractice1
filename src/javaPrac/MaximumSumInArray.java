package javaPrac;

public class MaximumSumInArray {

    public static void main(String[] args) {
        int [] arr = {-1,3,4,-2,5,-7};
        System.out.println( MaximumSumInArray.getMaximumSum(arr));
    }

    private static int getMaximumSum(int[] nums) {
        int result = nums[0];
        int sum = nums[0];

        for(int i=1; i<nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            result = Math.max(result, sum);
        }

        return result;

    }
}
