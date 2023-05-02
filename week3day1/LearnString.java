package week3day1;

public class LearnString {

	public static void main(String[] args) {
		String s="Testleaf";
		String s1=new String("testleaf");
		
		if(s==s1) {
			System.out.println("Both strings are placed in same memory address");
		}
		else {
			System.out.println("Both Strings are placed in  different memory");
		}
		
		if(s.equals(s1)) {
			System.out.println("String values are same");
		}
		else {
			System.out.println("String Values are different");
		}
		
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("String values are same");
		}
		else {
			System.out.println("String Values are different");
		}
		
		boolean contains = s.contains("leaf");
		System.out.println(contains);

	}

}
