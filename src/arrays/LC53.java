package arrays;

public class LC53 {
    public int maxSubArray(int[] nums) {
        int curSum = 0, maxSum = nums[0];

        for(var num : nums) {
            curSum += num;
            maxSum = Math.max(maxSum,curSum);
            if(curSum < 0) curSum = 0;
        }

        return maxSum;
    }
}
