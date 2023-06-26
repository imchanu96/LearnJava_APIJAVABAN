package ezen.eight;

public class ReferenceParam {

	void change(Data data) {
		data.num = 1000;
		
		System.out.println("change(): data.num= " + data.num);
	}
}
