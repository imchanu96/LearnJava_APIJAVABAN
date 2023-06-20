
public class TypeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 정수형 
		 byte	<	short	<	int		<	long
		 크기(size)
		 1			2			4			8
		 
		 단위
		 bit?
		 
		 2의 8승 -> 256 -> /2 -> -128 ~ +127(음수,0,양수 포함)
		 저장 가능한 값의 범위
		 
		 */
		
		byte byteValue = (byte) - 256;
		int intValue = 100;
		long longValue = 1000;
		
		System.out.println("byteValue:\t" + byteValue);
		System.out.println("intValue:\t" + intValue);
		System.out.println("longValue:\t" + longValue);
		
//	byteValue = intValue;  (변수이기 때문에 언제든지 바꿀수 있기 때문에 담을수 없는수는 안된다)
//		
//		System.out.println("byteValue" + byteValue);
//		System.out.println("intValue" + intValue);
	}

}
