package test;

public class ArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
sum(4,5);
sum(6,6);
sum(10,20,30);
	}
	public static void sum() {
		 int a=5+5;
		 System.out.println(a);
		
	 }
 public static void sum(int x,int y ) {
	 int a=x+y;
	 System.out.println(a);
	
 }
 public static void sum(int p,int q,int r ) {
	 int b=p+q+r;
	 System.out.println(b);
	
 }
}
