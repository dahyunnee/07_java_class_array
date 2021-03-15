package step7_01.classArray;

import java.util.Scanner;


class Subject8{
	String name;
	int score;
}

class Student8{
	Subject8[] subjects;
	String name;
}



public class ClassArrayEx08_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100
		
		Student8 [] stdList = new Student8[3];
		int stdCnt = 0;	// 학생 수
		
		while (true) {
			
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]종료하기");
			int choice = scan.nextInt();
			
			if		(choice == 1) {
			
				if (stdCnt >= 3 ) {
					
					System.out.println("학생 수 초과");
					continue;
				}
				stdList[stdCnt] = new Student8();

				System.out.print(" [이름] : ");
				stdList[stdCnt].name = scan.next();
				
				
				stdCnt ++;
				
				System.out.println("[ 학생 리스트 ]");
				for (int i = 0; i < stdCnt; i++) {
					
					System.out.println("[ " + (i+1) + " ]" + stdList[i].name);
				}
				
			}
			else if (choice == 2) {
				
				System.out.println("[ 학생 리스트 ]");
				for (int i = 0; i < stdCnt; i++) {
					
					System.out.println("[ " + (i+1) + " ]" + stdList[i].name);
				}
				System.out.print("학생 선택 : ");
				int getStudentIndex = scan.nextInt() - 1;		//학생인덱스 
				
				if ( stdList[getStudentIndex].subjects == null ) {
					
					stdList[getStudentIndex].subjects = new Subject8[1];
					
					stdList[getStudentIndex].subjects[0] = new Subject8();
										
					System.out.print("[과목명] : ");
					stdList[getStudentIndex].subjects[0].name = scan.next();
					
				}
				
				else {
					
					Subject8[] temp = stdList[getStudentIndex].subjects;
					
					stdList[getStudentIndex].subjects = new Subject8[temp.length + 1];
					
					for (int i = 0; i < temp.length; i++) {
						
						stdList[getStudentIndex].subjects[i] = temp[i];
						
					}
					
					stdList[getStudentIndex].subjects[stdList[getStudentIndex].subjects.length - 1] = new Subject8();
					
					System.out.print("[과목명] : ");
					stdList[getStudentIndex].subjects[stdList[getStudentIndex].subjects.length - 1].name = scan.next();
					
				}
		
				System.out.println( stdList[getStudentIndex].name + "의 [ 과목 리스트 ]");
				for (int i = 0; i < stdList[getStudentIndex].subjects.length; i++) {
					
					System.out.println("[ " + (i+1) + " ]" + stdList[getStudentIndex].subjects[i].name);
				}
			}
			
			else if (choice == 3) {
				
			
				System.out.println("[ 학생 리스트 ]");
				for (int i = 0; i < stdCnt; i++) {
					
					System.out.println("[ " + (i+1) + " ]" + stdList[i].name);
				}
				System.out.print("학생 선택 : ");
				int getStudentIndex = scan.nextInt() - 1;		//학생인덱스 
				
				
				System.out.println("[ 과목 리스트 ]");
				for (int i = 0; i < stdList[getStudentIndex].subjects.length; i++) {
					
					System.out.println("[ " + (i+1) + " ]" + stdList[getStudentIndex].subjects[i].name);
				}
				System.out.print("과목 선택 : ");
				int getSubjectName = scan.nextInt() - 1; 	//과목 인덱스
				
				
				System.out.print("점수 입력 : ");
				stdList[getStudentIndex].subjects[getSubjectName].score = scan.nextInt();
			
				
				System.out.println(stdList[getStudentIndex].name + "의 " +
						stdList[getStudentIndex].subjects[getSubjectName].name + 
						"과목의 점수 : "  + stdList[getStudentIndex].subjects[getSubjectName].score);
			}
			
		}


	}

}
