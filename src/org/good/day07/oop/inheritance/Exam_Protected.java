package org.good.day07.oop.inheritance;

import org.good.day07.oop.point.Point;

class Super {
	public int pub;
	int def;
	protected int pro;
	private int pri;

}

class Sub extends Super {
	private int childMoney;

	void set() {
		super.pub = 11;
		super.def = 13;
		super.pro = 4;
		// The field Super.pri is not visible
//		super.pri = 26;
	}
}

class ShapePoint extends Point {
	private String shape;

	void set() {
		super.pub = 11;
		// 같은 패키지가 아니기 때문에 불가능
		// The field Point.def is not visible
//		super.def = 13;
		// 상속을 받은 클래스이기 때문에 Point의 pro필드 접근가능
		super.pro = 4;
		// The field Point.def is not visible
//		super.pri = 25;
	}
}

public class Exam_Protected {

	public static void main(String[] args) {

	}

}
