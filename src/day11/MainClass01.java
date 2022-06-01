package day11;

public class MainClass01 {
	
	public static void main(String[] args){
		/*
		if(true) 
		{
			int num = 100;
			System.out.println("if : "+num);
			num = 200;
		}
		System.out.println("main : "+num);
		*/
		TestClass01 t01 = new TestClass01();
		int a =t01.test01();
		t01.test02(a);
	}
}
