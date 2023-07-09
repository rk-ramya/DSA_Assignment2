package project.demo;

import java.util.Arrays;

class Question1 {
	public static void main(String[] args) {
		
        int[] nums = {1,3,4,13};
		Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2)
        {
            sum=sum+nums[i];
        }
        System.out.println(sum);
    }
}