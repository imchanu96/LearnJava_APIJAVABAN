package eight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class BasicMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> dictionaryMap = new HashMap<String, String>();
		
		dictionaryMap.put("a", "apple");
		dictionaryMap.put("b", "banana");
		dictionaryMap.put("c", "core");
		dictionaryMap.put("d", "dynamic");
		
		Set set = dictionaryMap.keySet();
		
		Iterator<String> it = set.iterator();
		
		String dictionnaryKeyStr = "";
		
		while (it.hasNext()) {
			dictionnaryKeyStr = it.next();
			// 키값을 인터럽트하게 되면 찾을수가 없다. 
			// 그래서 hasNext를 통해 키값의 전부를 볼수 있다.
			System.out.println("사전의 키값: " + dictionnaryKeyStr 
					+ "의 키값에 맞는  사전 단어 : " + dictionaryMap.get(dictionnaryKeyStr));
			
		}
	}

}
