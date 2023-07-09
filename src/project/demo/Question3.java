package project.demo;

import java.util.ArrayList;
import java.util.Arrays;

class Question3 {
	public static void main(String[] args) {
		int[] nums = {5,10,2,3,2,3,16};
		int len = nums.length;
        int left = 0;
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            while (left < i && nums[i] - nums[left] > 1L) {
                left++;
            }
            if (nums[i] - nums[left] == 1L) {
                result = Math.max(i - left + 1, result);
            }
        }
       System.out.println(result);
    }
}
	