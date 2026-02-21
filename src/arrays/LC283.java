package arrays;

public class LC283 {
    public void moveZeroes(int[] nums) {
        int zeros = 0,temp = 0,n = nums.length;
        for(int i = 0;i < n;i++) {
            if(nums[i] == 0) {
                zeros++;
                continue;
            }
            temp = nums[i-zeros];
            nums[i-zeros] = nums[i];
            nums[i] = temp;
        }
    }
}
