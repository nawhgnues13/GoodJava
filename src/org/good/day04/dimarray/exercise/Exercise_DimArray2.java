package org.good.day04.dimarray.exercise;

public class Exercise_DimArray2 {

	public static void main(String[] args) {
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21

		int nums[][] = new int[5][5];
		int k = 1;
		// 이차원배열 데이터 입력
		for (int i = 0; i < nums.length; i++) {
			for (int j = nums[i].length - 1; j >= 0; j--) {
				nums[j][i] = k++;
			}
		}
		// 이차원 배열 출력
		for (int i = 0; i < nums.length; i++) {
			for (int j : nums[i]) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}
	}

}
