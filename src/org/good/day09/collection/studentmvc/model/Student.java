package org.good.day09.collection.studentmvc.model;

public class Student {
	// 필드(멤버변수)
	private String name;
	private int firstScore;
	private int secondScore;

	public Student() {

	}

	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}

	// getter/setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFirstScore() {
		return firstScore;
	}

	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}

	public int getSecondScore() {
		return secondScore;
	}

	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}

}
