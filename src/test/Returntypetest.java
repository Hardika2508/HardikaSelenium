package test;

public class Returntypetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=sum();
System.out.println(b);
String c=hello();
System.out.println(c);
	}
	public static int sum() {
		int a=4+5;
		return a;
		
	}
	public static String hello() {
		String s="hello Java";
		return s;		
				
	}

}
