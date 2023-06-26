package edu.methodAndMain.method.one;

public class Gugudan2 {

	public void printGugudan() {

		String gugudanStr = "";

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				gugudanStr = i + " * " + j + " = " + (i * j) + "\t";

				System.out.print(gugudanStr);
			}
			System.out.println();
		}
	}
	
	public void printGugudan(int danNum) {

		String gugudanStr = "";

		for (int i = 2; i <= 9; i++) {

				gugudanStr = danNum + " * " + i + " = " + (danNum * i) + "\t";

				System.out.print(gugudanStr);
	
		}
		System.out.println();
	}

	
	public void printGugudan(int startDanNum, int endDanNum) {
		String gugudanStr = "";
		

		for (int i = startDanNum; i <= endDanNum; i++) {
			for (int j = 1; j <= 9; j++) {
				gugudanStr = i + " * " + j + " = " + (i * j) + "\t";
				
				System.out.print(gugudanStr);
			}
			System.out.println();
		}
	}
}
