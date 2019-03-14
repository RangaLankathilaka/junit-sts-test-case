package test;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
	
	public static int add(int a,int b) {
		
		return a+b;
	}
	
	List<String>  nameList=new ArrayList<>();
	public List<String> getName(String name){
		
		nameList.add(name);
		System.out.println(nameList.size());
		return nameList;
	}
	
	public static void main(String[] args) {
		
		int sum=add(12, 45);
	    System.out.println(sum);
	    HelloWorld helloWorld=new HelloWorld();
	    
	    helloWorld.getName("Ranga");
	    helloWorld.getName("Sanka");
	    helloWorld.getName("Nuwan");
	    System.out.println(helloWorld.nameList);
	    
	}

}
