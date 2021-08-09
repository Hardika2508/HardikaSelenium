package test;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class Arraylisttest {

	public static void main(String[] args) {
		// classnaame objname =STRINGlassname();
		
		ArrayList<String>tools = new ArrayList<String>();
		
		tools.add("Selenium");
		tools.add("SQL");
		tools.add("Junit");
	    tools.add("TestNG");
		tools.add("ANT");
		System.out.println(tools.size());
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		System.out.println(tools.get(4));
		System.out.println("----------------------------");
	tools.remove(2);
	System.out.println(tools.get(2));
	System.out.println("--------------------------------");
	for (int i=0; i<tools.size();i++)
	{
		System.out.println(tools.get(i));
		
	}
	}

}
