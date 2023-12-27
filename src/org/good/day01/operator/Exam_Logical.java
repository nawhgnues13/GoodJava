package org.good.day01.operator;

public class Exam_Logical {

	public static void main(String[] args) {
		// 논리연산자 예제
		// Oracle에서 WHERE절 뒤에 적었던 논리연산자 AND, OR
		// 와 같은 역할을 함.
		// ex) 남자이면서 평균평점이 4.3이상인 사람
		// 컴퓨터공학과 또는 경영학과인 사람
		boolean result1, result2, result3, result4;
//		boolean result2;
//		boolean result3;
//		boolean result4;
		// num1 cannot be resolved to a variable
		int num1 = 50;
		int num2 = 30;
		result1 = (num1 == num2) && (num1 < num2);
		result2 = (num1 < num2) || (num1 == num2);
		result3 = (num1 > num2) && (num1 != num2);
		result4 = (num1 > num2) || (num1 == num2);
		// result1의 결과값 : false
		// result2의 결과값 : false
		// result3의 결과값 : true
		// result4의 결과값 : true

		int a = 70;
		int b = 55;
		// a는 70, b는 55다.
		// result1 = (a == b) || (a++ < 100);
		// result2 = (a < b) && (--b < 55);
		// result3 = (a != b) && (b-- < a++);
		// result4 = (a++ != b) || (b++ >= 85);
		// a : 73, b : 54
		// result1 : true, result2 : false, result3 : true, result4 : true
		System.out.println(a + ", " + b);
	}

}
