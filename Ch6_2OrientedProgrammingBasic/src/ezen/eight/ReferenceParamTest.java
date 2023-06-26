package ezen.eight;

public class ReferenceParamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferenceParam rp = new ReferenceParam();
		Data data = new Data();
		
		int num = 10;
		data.num = num;
		
		System.out.println("change() 전 num: " + data.num);
		
		rp.change(data);
		System.out.println("change() 끝나고 난 후 num: " + data.num);
	}

}
