package org.good.day02.random;

import java.util.Random;

public class Exam_Random {

	public static void main(String[] args) {
		Random rand = new Random();
		// 0부터 n-1까지의 랜덤한 수 리턴!
		// 0부터 9까지
		// 1부터 10까지
		// 25부터 35사이의 랜덤한 수 출력하기 위한
		System.out.println(rand.nextInt(11) + 25);
	}
}
