package org.good.day11.sort;

public class Exam_SortRecap {
	public void insertionSort() {
		int[] nums = { 23, 11, 13, 24, 4, 25 };
		// 삽입정렬은 왼쪽으로 작은값을 보냄
		for (int i = 1; i < nums.length; i++) { // 두번째 항부터 시작
			for (int j = i; j > 0; j--) {
				if (nums[j - 1] > nums[j]) { // 현재 항이 이전 항보다 작으면
					int temp = nums[j - 1]; // 교환
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		// 출력
		printArr(nums);
	}

	public void selectionSort() {
		int[] nums = { 23, 11, 13, 24, 4, 25 };
		// 선택정렬은 왼쪽부터
		for (int i = 0; i < nums.length - 1; i++) {
			int min = i; // 최소값
			for (int j = i + 1; j < nums.length; j++) { // 현재 항 이후의 항 중에
				if (nums[min] > nums[j]) { // 더 작은값을 찾으면
					min = j;
				}
			}
			int temp = nums[min]; // 교환
			nums[min] = nums[i];
			nums[i] = temp;
		}
		// 출력
		printArr(nums);
	}

	public void bubbleSort() {
		int[] nums = { 23, 11, 13, 24, 4, 25 };
		// 버블정렬은 오른쪽부터
		// 23과 11 비교 -> 11 13
		// 23과 13 비교 -> 13 23
		// 23과 24 비교 -> 23 24
		// 24와 4 비교 -> 4 24
		// 24와 25 비교 -> 24 25
		// 11 13 23 4 24 25 // 비교는 5개
		// 11과 13 비교 -> 11 13
		// 13과 23 비교 -> 13 23
		// 23과 4 비교 -> 4 23
		// 23와 24 비교 -> 23 24
		// 11 13 4 23 24 25 // 비교는 4개
		// 11과 13 비교 -> 11 13
		// 13 4 비교 -> 4 13
		// 13 23 비교 -> 13 23
		// 11 4 13 23 24 25 // 비교는 3개
		// 11과 4 비교 -> 4 11
		// 11과 13 비교 -> 11 13
		// 4 11 13 23 24 25 // 비교는 2개
		// 4와 11 비교
		// 4 11 13 23 24 25 // 비교는 1개
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		printArr(nums);
	}

	public void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
