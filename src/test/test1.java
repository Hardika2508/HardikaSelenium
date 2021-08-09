package test;

import selenium.Test4;

public class test1 {
	static test1 t1= new  test1();
	static Test2 t2= new  Test2();
	static Test3 t3=new Test3();
	static Test4 t4=new Test4();
	
	
	public static void main(String[] args) {
		
		System.out.println("I'm in main method");
      printMe();
      
System.out.println("after print me");
scanMe();
t1.testMe();
t1.buildMe();
Test2.circle();
t2.square();
Test3.red();
t3.blue();
Test4.bmw();
t4.audi();

String a ="Hardika";
StringBuffer b= new StringBuffer("Hardika");
b.reverse();
System.out.println(b);
String str="abcde";
str.trim();
str.toUpperCase();
str.substring(3,4);
System.out.println(str);
	}
public static void printMe()
{
System.out.println("printme");	
}
public static void scanMe()
{
	System.out.println("scanme");
}
public void testMe()
{
	System.out.println("test me");
}
public void buildMe()
{
System.out.println("buildme");	
}


}
