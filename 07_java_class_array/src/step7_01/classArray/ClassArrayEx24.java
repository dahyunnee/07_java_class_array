package step7_01.classArray;

/*
 * # 싱글턴 패턴
 * 
 * - 객체를 딱 1번만 생성하고 싶을 때 사용하는 기법
 * 
 * */

class MySingleTon {
	
	// 1) private 기본 생성자를 만든다.
	private MySingleTon(){}
	// 2) 내부에서 static으로 자기 자신의 instance를 생성한다.
	private static MySingleTon instance = new MySingleTon();
	// 3) instance를 반환할 getter를 만든다.
	public static MySingleTon getInstance() {
		
		return instance;
	}
	
	
	void method1() {
		
		System.out.println("메소드1");
	}
	void method2() {
		System.out.println("메소드2");
	}
	void method3() {
		System.out.println("메소드3");
	}
	
}

class ClassTest {
	
	
}
public class ClassArrayEx24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MySingleTon test = new MySingleTon();  //error, 싱글톤 사용방식은 일반 클래스 사용방식과 다르다.

		//같은 객체
		System.out.println(MySingleTon.getInstance());
		System.out.println(MySingleTon.getInstance());
		System.out.println(MySingleTon.getInstance());
		System.out.println();
		
		System.out.println(new ClassTest());
		System.out.println(new ClassTest());
		System.out.println(new ClassTest());
		System.out.println();
		
		//다른 객체
		MySingleTon.getInstance().method1();	//싱글턴 클래스의 메소드 사용법
		MySingleTon.getInstance().method2(); 	//싱글턴클래스.getInstance().메소드명
		MySingleTon.getInstance().method3();
		System.out.println();
		
		MySingleTon temp = MySingleTon.getInstance();	//싱글턴 객체의 주소를 temp에 대입
		System.out.println(MySingleTon.getInstance());
		System.out.println(temp);	//싱글턴 객체와 동일한 데이터ㅡ
		System.out.println();
		
	}

}
