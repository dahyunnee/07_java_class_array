package step7_01.classArray;

/*

# static
	
	- 정적 필드와 정적 메소드는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버이다.
	- static 키워드를 통해 생성된 정적멤버들은 Heap영역이 아닌 Static영역에 할당한다.
	- Static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있다.
	- Garbage Collector의 관리 영역 밖에 존재하기에 Static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재한다.

*/

class Character {
	
	int level = 1;
	int hp = 100;
	int mana = 30;
	static int moveSpeed = 5;
	
	void showStatus() {
		
		System.out.println("level : " + level);
		System.out.println("hp : " + hp);
		System.out.println("mana : " + mana);
		System.out.println("moveSpeed : " + moveSpeed);
		System.out.println();
	}
	
	static void speedUp() {
		
		moveSpeed += 30;
	}
	
}

public class ClassArrayEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character c1 = new Character();
		c1.hp = 0;
		
		Character.moveSpeed += 10;		//static변수는 '클래스명.static변수' 형태로 접근!
		//c1.moveSpeed += 10;
		
		Character.speedUp();	//static메소드는 '클래스명.static메소드' 형태로 접근!
		//c1.speedUp();
		c1.showStatus();
		
		Character c2 = new Character();
		c2.hp -= 50;
		//c2.moveSpeed += 1000;
		c2.showStatus();
		
		Character c3 = new Character();
		c3.showStatus();
		
		
		
	}

}
