package org.good.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_While1 {

	public static void main(String[] args) {
		// While문을 이용하여 -1이 입력될때까지 정수를 입력받고
		// -1이 입력되면 입력한 수의 합을 출력하시오.
		Scanner sc = new Scanner(System.in);
		// #2, #3 방법
		int input = 0;
		int sum = 0;

		while (input != -1) {
			sum += input;
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
		}
		// #1.방법
//		while (true) {
//			System.out.print("정수 입력 : ");
//			input = sc.nextInt();
//			if (input == -1) {
//				break;
//			}
//			sum += input;
//		}
		System.out.printf("입력한 수의 합 : %d\n", sum);
		sc.close();
	}

}
