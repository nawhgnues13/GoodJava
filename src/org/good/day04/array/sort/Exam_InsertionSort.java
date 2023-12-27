package org.good.day04.array.sort;

public class Exam_InsertionSort {

	public static void main(String[] args) {
		// 삽입정렬
		// 정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘
		// 배열의 N번 인덱스값을 0번에서 n-1번 인덱스까지 비교~!
		// N은 1부터 시작
		// {2, 5, 4, 1, 3}
		int arrs[] = { 2, 5, 4, 1, 3 };
		for (int j = 1; j < arrs.length; j++) {
			for (int i = j; i >= 1; i--) {
				if (arrs[i - 1] > arrs[i]) {
					int temp = arrs[i];
					arrs[i] = arrs[i - 1];
					arrs[i - 1] = temp;
				}
			}
		}
		for (int i = 0; i < arrs.length; i++) {
			System.out.printf("%d ", arrs[i]);
		}

		// 오름차순, 작은거 찾아야 됨
		// 1 : 2하고 5비교 -> X
		// 1번째 동작 결과 {2, 5, 4, 1, 3}
		// 1 : 2하고 4비교 -> X
		// 2 : 5하고 4비교 -> 교환
		// 2번째 동작 결과 {2, 4, 5, 1, 3}
		// 1 : 2하고 1비교 -> 교환 ({1, 4, 5, 2, 3})
		// 2 : 4하고 2비교 -> 교환 ({1, 2, 5, 4, 3})
		// 3 : 5하고 4비교 -> 교환 ({1, 2, 4, 5, 3})
		// 3번째 동작 결과 {1, 2, 4, 5, 3}
		// 1 : 1하고 3비교 -> X
		// 2 : 2하고 3비교 -> X
		// 3 : 4하고 3비교 -> 교환 ({1, 2, 3, 5, 4})
		// 4 : 5하고 4비교 -> 교환 ({1, 2, 3, 4, 5})
//		int arrs[] = { 2, 5, 4, 1, 3 };
//		for (int i = 1; i < arrs.length; i++) {
//			for (int j = 0; j < i; j++) {
//				if (arrs[i] < arrs[j]) {
//					int temp = arrs[i];
//					arrs[i] = arrs[j];
//					arrs[j] = temp;
//				}
//			}
//		}
//		for (int i = 0; i < arrs.length; i++) {
//			System.out.printf("%d ", arrs[i]);
//		}
	}

}
