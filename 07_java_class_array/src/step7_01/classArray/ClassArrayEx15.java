package step7_01.classArray;

//생성자를 이용한 멤버변수 초기화

class Fruit {
	
	String name;
	int price;
	
	Fruit(String name, int price){
	
		this.name = name;
		this.price = price;
		
	}
	
	void printData() {
		
		System.out.println("이름 : " + this.name);
		System.out.println("가격 : " + this.price);
	}
	
	
	
}

public class ClassArrayEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit apple = new Fruit("사과", 800);	//생성자를 이용한 멤버변수 초기화
		apple.printData();
		
		Fruit banana = new Fruit("바나나", 2500);
		banana.printData();
		
		
	}

}


