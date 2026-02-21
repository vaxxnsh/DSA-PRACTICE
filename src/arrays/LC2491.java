package arrays;

public class LC2491 {
    public int[] rearrangeArray(int[] nums) {
        int evenIdx = 0,oddIdx = 1;
        int[] ans = new int[nums.length];

        for(var num : nums) {
            if(num > 0) {
                ans[evenIdx] = num;
                evenIdx+=2;
            }
            else {
                ans[oddIdx] = num;
                oddIdx += 2;
            }
        }

        return ans;
    }
}
