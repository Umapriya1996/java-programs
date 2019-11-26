package week1.day2.string;

public class CharacterOccurance {
	
	public static void main(String[] args) {
		
		String test = "I am getting better with Java";
		char ch = 't';
		int totalCount = 0;
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]==ch) {
			totalCount++;
			
		}
		}
		
		
	
	
		System.out.println("Total count of character("+ch+"): " + totalCount);
		
	
	}	
	

}
