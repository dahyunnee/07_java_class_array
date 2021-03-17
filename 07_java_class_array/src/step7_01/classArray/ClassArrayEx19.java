package step7_01.classArray;

import java.util.ArrayList;
import java.util.Arrays;


/*
 * 
 * [ 래퍼 클래스(wrapper class) ]
 * - 래퍼 클래스란, 기본 자료형을 클래스로 만들어 놓은 것을 의미한다.
 * [기본형]          [래퍼 클래스]
 * byte             Byte
 * short            Short
 * int              Integer
 * long             Long
 * float            Float
 * double           Double
 * char             Character
 * boolean          Boolean
 *
 *
 *
 *  [ java.util.ArrayList ]
 * - 배열은 한번 선언하면 프로그램에서 그 크기를 바꿀 수 없다.
 * - ArrayList 클래스는 데이터가 입력되면, 자동으로 크기가 커지고
 * - 데이터가 제거되면, 자동으로 크기가 작아진다.
 * - 중간에 데이터가 삽입되면, 데이터가 삽입될 위치부터 모든 데이터가 뒤로 이동되고
 * - 중간의 데이터가 제거된 다음 위치부터 모든 데이터가 앞으로 이동한다.
 * - ArrayList 생성 방법
 * 
 *   ArrayList list = new ArrayList();                      // JDK 1.4 이전
 *   ArrayList<Integer> list = new ArrayList<Integer>();    // JDK 1.5 이후
 *   ArrayList<Integer> list = new ArrayList<>();           // JDK 1.7 이후 
 * 
 *  [ 제네릭 ]
 * - 제네릭(generic)이라 부르며 ArrayList에 저장될 데이터 타입을
 *   반드시 클래스로 작성한다.
 * - 기본 자료형 데이터를 저장하는 ArrayList를 만들어야 하는 경우에는
 *   래퍼 클래스를 사용한다.
 *   
 */


public class ClassArrayEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int[] arr = new int[10];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("#############################");
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//add(value) : ArrayList의 맨뒤에 value를 추가한다.
		//add(index, value) : ArrayList의 index번째에 value를 추가한다.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("#############################");
		
		// size() : ArrayList의 데이터 개수를 반환
		System.out.println(arr.length);
		System.out.println(list.size());
		
		System.out.println("#############################");
		

		// set(index,value) : ArrayList의 index번째의 값을 value로 수정
		arr[0] = 1000;
		arr[1] = 2000;
		arr[2] = 3000;
		
		list.set(0, 1000);
		list.set(1, 2000);
		list.set(2, 3000);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("#############################");
		
		
		// remove(index) : ArrayList의 index번째 위치의 값을 삭제한다.
		
		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 0;
		
		list.remove(2);
		list.remove(1);
		list.remove(0);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("#############################");
		
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		
		//get(index) : ArrayList의 index번째의 value를 얻어온다.
		for (int i = 0; i < list.size(); i++) {
			
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println("#############################");

		/*
		 * 
		 *  # 향상된 for문
		 *  
		 *  [ 구조 ]
		 *  
		 *  for (자료형 변수명 : Array or ArrayList) {
		 *  	명령어;
		 *  }
		 * 
		 *  ArrayList의 element가 직접 변수에 저장된다.
		 * 
		 * */
		
		
		
		for (int element : arr) {		//for (Integer element : arr) 도 가능 
			System.out.print(element + " ");
		}
			
		System.out.println();
		
		
		for (int element : list) {
			
			System.out.print(element + " ");
		}
		System.out.println();
		
		
		
		System.out.println("#############################");

		// clear() : AarrayList의 모든 데이터를 제거한다. 
		arr = null;
		list.clear();
		
		
		
	}

}
