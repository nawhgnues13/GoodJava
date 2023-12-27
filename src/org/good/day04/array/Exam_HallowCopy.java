package org.good.day04.array;

public class Exam_HallowCopy {

	public static void main(String[] args) {
		int arrs1[] = new int[4];
		for (int i = 0; i < arrs1.length; i++) {
			arrs1[i] = i * i;
		}
		for (int i = 0; i < arrs1.length; i++) {
			System.out.printf("%d ", arrs1[i]);
		}
		System.out.println();
		int arrs2[] = arrs1;
		arrs1[1] = 11;
		arrs2[1] = 13;
		System.out.println(arrs1[1]); // 얕은 복사
	}

}
