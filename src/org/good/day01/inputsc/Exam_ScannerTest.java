package org.good.day01.inputsc;

import java.util.Scanner;

public class Exam_ScannerTest {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.print("도시를 입력해주세요 : ");
		String city = sc.next();
		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		System.out.print("체중을 입력해주세요 : ");
		double weight = sc.nextDouble();
		System.out.print("독신 여부를 입력해주세요 : ");
		boolean singleYN = sc.nextBoolean();
		System.out.printf("이름은 %s, 도시는 %s, 나이는 %d살, 체중은 %.1fkg, 독신여부는 %b입니다.\n", name, city, age, weight, singleYN);
		sc.close();
	}

}
