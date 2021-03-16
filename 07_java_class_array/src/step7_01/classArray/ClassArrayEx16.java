package step7_01.classArray;


/*
 * 
 * # 생성자 오버로딩
 * 
 *  - 생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
 *  - 생성자 오버로딩을 구현하기 위해서는 메서드와 마찬가지로
 *    파라메타의 개수나 타입을 다르게 정의 하면 된다.
 * 
 * */


class Fruit2{
	
	String name;
	int price;
	
	
	// 기본 생성자
	Fruit2(){
		
	}
	
	//생성자 오버로딩
	Fruit2(String name){
	
		this.name = name;
	}
	
	//생성자 오버로딩
	Fruit2(String name, int price) {
		
		this.name = name;
		this.price = price;
		
	}
	
}


public class ClassArrayEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Fruit2();
		new Fruit2("사과");
		new Fruit2("포도", 50000);
		
		
	}

}
