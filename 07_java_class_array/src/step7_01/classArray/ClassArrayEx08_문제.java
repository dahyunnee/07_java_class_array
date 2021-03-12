package step7_01.classArray;

import java.util.Scanner;

//class Subject{
//	String name;
//	int score;
//}
//
//class Student{
//	Subject[] subjects;
//	String name;
//}
//


public class ClassArrayEx08_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100
		
		Student [] stdList = new Student[3];
		int stdCnt = 0;	// 학생 수
		
		while (true) {
			
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]종료하기");
			int choice = scan.nextInt();
			
			if		(choice == 1) {}
			else if (choice == 2) {}
			else if (choice == 3) {}
			
		}


	}

}
