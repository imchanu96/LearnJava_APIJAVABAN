package ezen.seven;

public class Point3D extends Point{

	int z = 0;

	
	Point3D(int x, int y, int z) {
//		super(); //부모 생성자가 묵시적으로 무조건 생긴다.
		super(x, y);
//		this.x = x;
		
//		this.y = y;
		this.z = z;
	}
	
	public String getLocation() { // 오버라이딩
		String str = "";
		
		str = "x: " + x + " y: " + y + " z: " + z;
		
		return str;
	}
}
