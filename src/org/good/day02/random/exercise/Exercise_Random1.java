package org.good.day02.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {

	public static void main(String[] args) {
		// 동전 앞뒤 맞추기!!
//		====== 동전 앞 뒤 맞추기 ======
//		숫자를 입력해주세요(1. 앞면 / 2. 뒷면) : 1
//		맞췄습니다.

//		숫자를 입력해주세요(1. 앞면 / 2. 뒷면) : 2
//		맞췄습니다.

//		숫자를 입력해주세요(1. 앞면 / 2. 뒷면) : 1
//		틀렸습니다.
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = rand.nextInt(2) + 1;
			System.out.println("====== 동전 앞 뒤 맞추기 ======");
			System.out.print("숫자를 입력해주세요(1.앞면 / 2.뒷면 / 3.종료) : ");
			int input = sc.nextInt();
			System.out.println();
			if (input >= 1 && input <= 3) {
				if (input == 3) {
					System.out.println("종료되었습니다.");
					break;
				} else if (num == input) {
					System.out.println("맞췄습니다.");
				} else {
					System.out.println("틀렸습니다.");
				}
			} else {
				System.out.println("1 또는 2 또는 3을 입력해주세요.");
			}
			System.out.println();
		}
		// for문
		// for(int i = 0; i < 10; i++) { 실행문 }
	}
}
