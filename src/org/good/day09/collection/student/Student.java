package org.good.day09.collection.student;

public class Student {
	// 필드(멤버변수)
	private String name;
	private int firstScore;
	private int secondScore;

	// 생성자
	public Student() {

	}

	// 메소드
	// 필드에 값을 저장하는 메소드(우회)
	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}

	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}

	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}

	// getter 메소드
	public String getName() {
		return name;
	}

	public int getFirstScore() {
		return firstScore;
	}

	public int getSecondScore() {
		return secondScore;
	}
}
