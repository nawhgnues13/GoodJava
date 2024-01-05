package org.good.day09.collection.list.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_List1 {

	public static void main(String[] args) {
		// 이름을 4개 입력받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름을
		// 출력하여라.
		Scanner sc = new Scanner(System.in);

		// 1. 문자열만 삽입가능한 ArrayList 컬렉션 생성
//		ArrayList<String> strList = new ArrayList<String>();
		List<String> strList = new ArrayList<String>();
		// 2. 키보드로부터 4개의 이름을 입력받아 ArrayList에 삽입
		for (int i = 0; i < 4; i++) {
			System.out.printf("%d번째 이름 입력 : ", i + 1);
			strList.add(sc.next());
		}
		// 3. ArrayList에 들어있는 모든 이름 출력
		for (int i = 0; i < strList.size(); i++) {
			System.out.print(strList.get(i) + "  ");
		}
		System.out.println();
		// 4. 가장 긴 이름 출력
		int index = 0;
		for (int i = 0; i < strList.size(); i++) {
			if (strList.get(index).length() < strList.get(i).length()) {
				index = i;
			}
		}
		System.out.println("가장 긴 이름 : " + strList.get(index));
		sc.close();
	}

}
