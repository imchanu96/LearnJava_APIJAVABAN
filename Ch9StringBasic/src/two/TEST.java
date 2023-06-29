package two;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str = "aBcDef";
        String[] ab = str.split("");
        
        for (int i = 0; i < ab.length; i++) {
			if(ab[i].equals(ab[i].toUpperCase())) { 
				ab[i] = ab[i].toLowerCase();
			}else {
				ab[i] = ab[i].toUpperCase();
			}
			
			
		}
        for (int j = 0; j < ab.length; j++) {
			System.out.print(ab[j]);
		}
        
        
        
        
        
      
	}

}
