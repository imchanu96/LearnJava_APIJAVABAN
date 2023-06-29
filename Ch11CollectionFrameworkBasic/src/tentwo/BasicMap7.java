package tentwo;

import java.util.HashMap;

public class BasicMap7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		사원의 정보에는
//		사원번호
//		사원명
//		급여
//		정보가 있다.
//		
//		사원의 정보를 찾아서 지우는 프로그램을 만드시오
		
		HashMap<String, Employee> empMap 
			= new HashMap<String, Employee>();
		
		Employee employee = new Employee("0", "이사장", 5000);
		empMap.put(employee.getEmpNo(), employee);
		
//		음 일단 완벽하구만
//		System.out.println(empMap.get("0"));
		for (int i = 0; i < 3; i++) {
			employee = new Employee((i+1) + "", "사원"
					+ (i+1), (i+1)*500);
			empMap.put(employee.getEmpNo(), employee);
		}
//		전체 사원 파악
		for (int i = 0; i < empMap.size(); i++) {
			System.out.println(empMap.get(i + ""));
		}
		
		String inputEmpNo = "";
		inputEmpNo = "1";
		
		Employee choiceEmp = empMap.get(inputEmpNo); 
		if (choiceEmp != null) {
			System.out.println("사원을 찾았습니다.");
			empMap.remove(inputEmpNo);
			
			System.out.println("사원이 퇴사처리 되었습니다.");
		}
		
//		전체 사원 파악
		for (int i = 0; i < 4; i++) {
			System.out.println(empMap.get(i + ""));
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
