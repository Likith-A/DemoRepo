package com.controlstmandarray;
/**
 * To find pair of elements in the array having sum of 10
 * @author Likith
 * @version jdk11
 * @since 12/06/2023
 */
import java.util.*;

public class SumTen {
	public static int[] findPairSumTen(int[] nums) {
		int[] result = new int[2];
		Set<Integer> set = new HashSet<>();

		for (int num : nums) {
			int complement = 10 - num;
			if (set.contains(complement)) {
				result[0] = num;
				result[1] = complement;
				return result;
			}
			set.add(num);
		}

		result[0] = -1;
		result[1] = -1;
		return result;

	}
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the elements of the array separated by spaces:");

		String input = read.nextLine();
		String[] elements = input.split(" ");

		int[] nums = new int[elements.length];
		for (int i = 0; i < elements.length; i++) {
			nums[i] = Integer.parseInt(elements[i]);
		}

		int[] result = findPairSumTen(nums);

		if (result[0] == -1 && result[1] == -1) {
			System.out.println("-1");
		} else {
			System.out.println("(" + result[0] + "," + result[1] + ")");
		}
		read.close();
	}

}