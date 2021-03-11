package step7_01.classArray;

class Card{
	
	int num;
	String shape;
	
}

public class ClassArrayEx02 {

	public static void main(String[] args) {
		
		 Card[] arr = new Card[10];
		 
		 // for문 활용
		 for (int i = 0; i < 10;  i++) {
			 arr[i] = new Card();
			 arr[i].num = (i + 1);
			 arr[i].shape = "클로버";
		 }

		 for (int i = 0; i < arr.length; i++) {
			System.out.println("num : " + arr[i].num);
			System.out.println("shape : " + arr[i].shape);
			System.out.println();
		}
		 
	}

}
