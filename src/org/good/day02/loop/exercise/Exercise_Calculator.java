package org.good.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			double result = 0;
			System.out.print("정수 하나 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			char operator = sc.next().charAt(0);
			switch (operator) {
			case '+':
				result = num1 + num2;
				System.out.printf("%d + %d = %d\n", num1, num2, (int) result);
				break;
			case '-':
				result = num1 - num2;
				System.out.printf("%d - %d = %d\n", num1, num2, (int) result);
				break;
			case '*':
				result = num1 * num2;
				System.out.printf("%d * %d = %d\n", num1, num2, (int) result);
				break;
			case '/':
				result = num1 / (double) num2;
				System.out.printf("%d / %d = %.2f\n", num1, num2, result);
				break;
			case '%':
				result = num1 % num2;
				System.out.printf("%d %% %d = %d\n", num1, num2, (int) result);
				break;
			}
		}
	}

}
