package ezen.seven;

public class Point { //부모 클래스여도 부모 클래스 Object클래스를 상속 받아져 있다.

	int x;
	int y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
//		super(); 평소에는 묵시적으로 되어있다.
		this.x = x;
		this.y = y;
	}
	
	public String getLocation() {
		String str = "";
		
		str = "x: " + x + " y: " + y;
		
		return str;
	}
}
