package test;

public class Test3 {
	static Test3 t3=new Test3();
	static test1 t1=new test1();
	public static void main(String[] args) {
	
		red();
		t3.blue();
		test1.printMe();
		t1.testMe();
	}
	public static void red()
	{
		System.out.println("red");
	}
	
	public void blue() {
		System.out.println("blue");
	}
	
	
}
