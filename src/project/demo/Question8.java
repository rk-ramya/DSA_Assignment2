package project.demo;

import java.util.HashMap;
import java.util.Map;

public class Question8 {

		public static void greaterthanNdK(int a[], int n, int k)
		{
			int var = n / k;
			HashMap<Integer, Integer> nums = new HashMap<>();
			for (int i = 0; i < n; i++) {
				
				if (!nums.containsKey(a[i]))
					nums.put(a[i], 1);


				else {
					int count = nums.get(a[i]);
					nums.put(a[i], count + 1);
				}
			}

		
			for (Map.Entry m : nums.entrySet()) {
				Integer temp = (Integer)m.getValue();
				if (temp > var)
					System.out.println(m.getKey());
			}
		}

	
		public static void main(String[] args)
		{

			int a[] = new int[] { 1, 1, 2, 2, 3, 5, 4,
								2, 2, 3, 1, 1, 1 };
			int n = 12;
			int k = 4;
			greaterthanNdK(a, n, k);
		}
	}

	