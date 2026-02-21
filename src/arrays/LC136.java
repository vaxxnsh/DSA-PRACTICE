package arrays;

public class LC136 {
    public int singleNumber(int[] nums) {
        int once = nums[0];

        for(int i = 1;i < nums.length;i++) once ^= nums[i];

        return once;
    }
}
