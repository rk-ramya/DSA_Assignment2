package project.demo;

import java.util.HashMap;

import com.sun.net.httpserver.Authenticator.Result;

class Question4 {
	public static void main(String[] args) {
		
		int[] nums = {1,0,0,0,1,0,0,0};
		int len = nums.length;
		int flag=0;
		
		HashMap<Integer,Integer> result = new HashMap<>();
		for(int i=1;i<nums.length-2;i++) 
			if(nums[i-1]==0&&nums[i+1]==0)
				flag++;
		
		System.out.println(flag);
		}
	}
	