package day11;

public class TestClass03 {
	//static : 클래스 변수 (객체를 만들지 않아도 사용가능), 우선 순위 1번
	/*
	 지역변수 : 해당 지역이 사라질때 사라짐
	 객체 변수 : 해당 객체가 사라질때 사라짐
	 클래스 변수 : 가장 마지막에 사라짐
	 */
	public static final String KOREA = "대한민국";
	
	public static int num = 1000;
	public void test02() {
		num =1234;
	}
	
	
	
	
	public  static String name = "홍길동";
	public static void test() {
		System.out.println("test 실행");
	}
}
