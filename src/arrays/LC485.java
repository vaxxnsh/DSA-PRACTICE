package arrays;

public class LC485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCon = 0,con = 0;

        for(var num : nums) {
            if(num == 1) con++;
            else con = 0;

            maxCon = Math.max(maxCon,con);
        }

        return maxCon;
    }
}
