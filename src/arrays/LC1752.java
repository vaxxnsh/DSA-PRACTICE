package arrays;

// 1752. Check if Array Is Sorted and Rotated

public class LC1752 {
    public boolean check(int[] nums) {
        int i = 1,n = nums.length;
        for(;i < n;i++) {
            if (nums[i] < nums[i-1]) break;
        }
        if (i == n) return true;
        i++;
        for(;i < n;i++) {
            if(nums[0] < nums[i] || nums[i-1] > nums[i]) return false;
        }
        return nums[n-1] <= nums[0];
    }
}
