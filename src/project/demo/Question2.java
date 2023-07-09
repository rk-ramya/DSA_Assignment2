package project.demo;

import java.util.HashSet;
import java.util.Set;

class Question2 {
	public static void main(String[] args) {
    	int[] candyType =  {1,1,2,2,3,3,9};

    	        Set<Integer> set = new HashSet<>();
    	        for (int c : candyType) set.add(c);
    			
    	        System.out.println(set.size());
    	    }
    	
    }
