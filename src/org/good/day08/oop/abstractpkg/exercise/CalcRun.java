package org.good.day08.oop.abstractpkg.exercise;

public class CalcRun {

	public static void main(String[] args) {
		// Cannot instantiate the type Calculator
//		Calculator calculator = new Calculator();
		Calculator calculator = new CherryCalc();
		CherryCalc cCalc = new CherryCalc();
		int[] a = { 23, 11, 13, 4, 25 };
		System.out.println("합 : " + calculator.add(11, 13));
		System.out.println("차 : " + calculator.substract(4, 25));
		System.out.println("평균 : " + calculator.average(a));

	}

}
