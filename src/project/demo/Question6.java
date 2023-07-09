package project.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question6 {
	
		public static void main(String[] args) {
			Integer arr[] = {-1,0,3,5,9,12};
			List<Integer> result =new ArrayList<Integer>();
			Collections.addAll(result, arr);
			int target=123;
			if(result.contains(target))
				System.out.println(result.indexOf(target));
			else 
				System.out.println("-1");
			

		}
	}
	