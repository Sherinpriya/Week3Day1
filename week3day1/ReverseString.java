package week3day1;

public class ReverseString {

	public static void main(String[] args) {

		
		String S = "Sherin";

		char[] charArray = S.toCharArray();

		System.out.println(charArray);
		System.out.println();
		for (int i = charArray.length-1; i >= 0; i--) {
			System.out.print(charArray[i]);
	    }
		
	}

}
