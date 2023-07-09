package project.demo;

import java.util.Arrays;

public class Question5 {
		static int maxProduct(int arr[], int n) {
			if (n < 3) {
				return -1;
			}
			Arrays.sort(arr);
			return Math.max(arr[0] * arr[1] * arr[n - 1],
					arr[n - 1] * arr[n - 2] * arr[n - 3]);
		}

		public static void main(String[] args) {
			int arr[] = {-10, -3, 5, 6, -20};
			int n = arr.length;

			int max = maxProduct(arr, n);

			if (max == -1) {
				System.out.println("No Triplet Exists");
			} else {
				System.out.println("Maximum product is " + max);
			}

		}
	}
	