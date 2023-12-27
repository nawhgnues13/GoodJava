package org.good.day03.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {

	public static void main(String[] args) {
		// 배열의 length 필드를 이용하여 배열 크기만큼 정수를
		// 입력받고 평균을 구하는 프로그램을 작성하라.
		// 단, 배열의 크기는 5이다.
		int arrs[] = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		// 입력부분
		for (int i = 0; i < arrs.length; i++) {
			System.out.printf("정수 입력 (%d) : ", i + 1);
			arrs[i] = sc.nextInt();
		}
		// 출력부분
		for (int i = 0; i < arrs.length; i++) {
			sum += arrs[i];
		}
		// 형변환, 정수 / 정수 = 정수 -> 실수 / 정수 = 실수
		System.out.printf("평균 : %.1f", (double) sum / arrs.length);

		// 양수 5개를 입력받아 배열에 저장하고, 제일 큰수를 출력하는
		// 프로그램을 작성하시오.
//		Scanner sc = new Scanner(System.in);
//		int nums[] = new int[5];
//		int max = 0;
//		for (int i = 0; i < nums.length; i++) {
//			System.out.printf("정수 입력 (%d) : ", i + 1);
//			nums[i] = sc.nextInt();
//			// 입력한 값이 제일 큰가?
//			if (nums[i] > max) {
//				max = nums[i];
//			}
//		}
//		System.out.println("최대값 : " + max);
	}

}
