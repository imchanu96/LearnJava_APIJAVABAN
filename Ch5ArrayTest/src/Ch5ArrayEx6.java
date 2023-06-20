
public class Ch5ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 우리반에서 아는 사람 이름 3개를 다른 배열에 복제하고 마지막 사람의 이름을 본인 이름으로 변경하여 서로 다르게 값을 가질수 있음을
		 * 증명하시오
		 * 
		 */

		String[] nameArr = { "유호준", "조남용", "손진원" };
		String[] newNameArr = new String[3];

		
		System.out.println("============원본==========");
		for (int i = 0; i < newNameArr.length; i++) {
			System.out.print(nameArr[i] + "\t");
		}

		for (int i = 0; i < newNameArr.length; i++) {
			newNameArr[i] = nameArr[i];
				}

			System.out.println("");
			
		
		System.out.println("============원본==========");
		for (int i = 0; i < newNameArr.length; i++) {
			if (i == 2) {
				newNameArr[2] = "임찬우";
			}
			System.out.print(newNameArr[i] + "\t");
		}
	}
}
