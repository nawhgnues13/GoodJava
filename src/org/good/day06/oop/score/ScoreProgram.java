package org.good.day06.oop.score;

import java.util.Scanner;

public class ScoreProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = 0; // case1 안에서 선언된 변수(kor, eng, math)는 case2에서 사용 못함
		int eng = 0; // 지역변수의 개념이고 case1, case2에서 모두 쓰려면 밖에서 선언하ㅕ
		int math = 0; // 사용해야 함. 이것이 전역변수의 개념임.
		finish: while (true) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt(); // 번호로 메뉴선택 값을 입력받음
			switch (choice) {
			case 1:
				System.out.println("====== 성적 입력 ======");
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				break;
			case 2:
				System.out.println("====== 성적 출력 ======");
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("총점 : " + (kor + eng + math));
				System.out.println("평균 : " + (kor + eng + math) / 3.0);
				break;
			case 3:
				System.out.println("프로그램이 종료되었습니다.");
				break finish; // while 탈출
			default:
				System.out.println("1 ~ 3 사이의 숫자를 입력해주세요.");
				break;
			}
		}
	}

}
