package org.good.day02.loop.exercise;

public class Exercise_ForDouble1 {

	public static void main(String[] args) {
		// 2단을 세로로 출력, 그 옆에 3단 세로로 출력,
		// 그 옆에 4단 세로로 출력
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\t", j, i, i * j);
			}
			System.out.println();
		}
	}

}
