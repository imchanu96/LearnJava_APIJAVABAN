
public class Ch4Etc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int com = 0;
		
		double num = 0;
		
		num = Math.random();

		System.out.println(num);
//		95~100
		com = (int)(Math.random() * 6) + 1;
//			   정수화	난수			   범위	시작위치		
//		Math.random() *n) = 임의의 수를 정할수 있음 
		
		System.out.println("COM은" + com + "입니다.");
	}
	

}
