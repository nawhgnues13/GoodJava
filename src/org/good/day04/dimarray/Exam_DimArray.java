package org.good.day04.dimarray;

public class Exam_DimArray {

	public static void main(String[] args) {
		int num = 0;
		int nums[] = new int[10];
		int dimNums[][] = new int[2][5];
		System.out.println("앞의 크기 : " + dimNums.length);
		System.out.println("뒤의 크기1 : " + dimNums[0].length);
		System.out.println("뒤의 크기2 : " + dimNums[1].length);

		int arrs[][] = new int[4][4];
		// 2차원 배열에 값 입력하기
		int k = 1;
		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k++;
			}
		}
		// 2차원 배열 값 출력하기
		for (int i = 0; i < arrs.length; i++) {
			for (int j : arrs[i]) {
				System.out.printf("%d ", j);
			}
			System.out.println();
		}
	}

}
