package arrays;

import java.util.Arrays;

public class LC75 {
    public static void sortColors(int[] nums) {
        int i = 0, l = 0, r = nums.length - 1;

        while(i <= r) {
            switch(nums[i]) {
                case 0:
                    if (i != l) swap(l, i, nums);
                    l++;
                    i++;
                    break;

                case 1:
                    i++;
                    break;

                case 2:
                    swap(r,i,nums);
                    r--;
                    break;
            }
        }
    }

    public static void swap(int i,int j,int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,0,1};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}
