package leetcode.ZeroMax;

import java.util.Arrays;

public class ZeroMax {
    public static int[]array = new int[]{0,4,0,3};

    public int[] zeroMax(int[] nums){
        int maxOdd = Integer.MIN_VALUE;
        boolean wasOdd = false;
        for (int i = nums.length-1; i >=0 ; i--) {
            if (nums[i] % 2 !=0){
                maxOdd = Math.max(nums[i],maxOdd);
                wasOdd = true;
            }
            if(nums[i]==0 && wasOdd){
                nums[i] = maxOdd;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        ZeroMax zeroMax = new ZeroMax();
        int[] newArray = zeroMax.zeroMax(array);
        System.out.println(Arrays.toString(newArray));
    }


}
