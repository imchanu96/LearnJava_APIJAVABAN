
public class Ch3OperatorEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		논리 연산자
		  
		  ||(or연산자) : 피연산자 중 어느 한 쪽만 true이면 true를 결과로 얻는다.
		  &&(and연산자) : 피연산자 양쪽 모두 true이어야 true를 결과로 얻는다.
		  
		  ||,&& 와 |,&는 다르다.
		  ||,&&은 앞의 값에 따라 뒤의 값을 생략해도 되지만
		  |,&는 앞의 값으로 값의 변동이 없어도 뒤의 값도 계산을 진행해야한다.
		  
		  */
		  
		int x = 10;
		int y = 3;
		
		
		
		System.out.println(x == y && x != y); 
		System.out.println(x != y && x > y ); 
		System.out.println(x > y || x < y);
		System.out.println(x < y || x == y);

		
//		System.out.println(10 <= x < 20);
		System.out.println(10 <= x && x < 20);
		
		
		
	}

}
