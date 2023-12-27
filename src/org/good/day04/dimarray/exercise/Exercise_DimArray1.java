package org.good.day04.dimarray.exercise;

public class Exercise_DimArray1 {

	public static void main(String[] args) {
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25

		int nums[][] = new int[5][5];
		int k = 1;
		// 이차원배열 데이터 입력
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = k++;
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
