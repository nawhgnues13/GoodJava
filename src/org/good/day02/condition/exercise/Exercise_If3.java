package org.good.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_If3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		// 100 ~ 90 : A
		// 89 ~ 80 : B
		// 79 ~ 70 : C
		// 69 ~ 60 : D
		// 60미만 : F
		// 학점은 F입니다.
		// 모델 방식
		char grade = ' ';
		if (score < 101 && score >= 0) {
			if (90 <= score && score <= 100) {
				grade = 'A';
			} else if (80 <= score && score < 90) {
				grade = 'B';
			} else if (70 <= score && score < 80) {
				grade = 'C';
			} else if (60 <= score && score < 70) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.printf("학점은 %c입니다.", grade);
		} else {
			System.out.println("0 ~ 100 사이의 수를 입력해주세요.");
		}
		sc.close();
	}

}
