package org.good.day02.loop;

public class Exam_ForDouble {

	public static void main(String[] args) {
		// 1*1=1 1*2=3 1*3=3 .... 1*9=9

		// 중첩for문 - 반복이 되는 for문을 다시 반복
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%d x %d = %d\t", j, i, i * j);
			}
			System.out.println();
		}
	}

}
