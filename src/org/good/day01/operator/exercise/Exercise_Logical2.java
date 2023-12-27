package org.good.day01.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {

	public static void main(String[] args) {
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요!
		// 문자를 입력해주세요 : a
		// 문자 출력 : a
		// 영어 대문자 확인 : false
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해주세요 : ");
		char word = sc.next().charAt(0);
		// char(문자) 숫자로 변환될 수 있다. by 유니코드
		// A - 65, Z - 90
		System.out.println((int) word);
		System.out.println("문자 출력 : " + word);
		boolean result = (word >= 'A') && (word <= 'Z');
		System.out.println("영어 대문자 확인 : " + result);
	}

}
