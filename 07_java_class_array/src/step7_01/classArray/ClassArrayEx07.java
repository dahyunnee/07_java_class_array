package step7_01.classArray;


//클래스 배열 응용

class Student{
	
	Subject[] subjects; 	//subject 객체를 담을 객체 배열
	String name;
	
}

class Subject{

	String name;
	int score;
	
}

public class ClassArrayEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] studentList = new Student[3];
		studentList[0] = new Student();
		studentList[0].subjects = new Subject[3];
		
		for (int i = 0; i < studentList.length; i++) {
			
			studentList[0].subjects[i] = new Subject();
		}
		
		//////////////////////////////////////////
		
		studentList[1] = new Student();
		
		studentList[1].subjects = new Subject[2];
		
		studentList[1].subjects[0] = new Subject();
		studentList[1].subjects[1] = new Subject();
		
		//////////////////////////////////////////
		
		studentList[2] = new Student();
		
		studentList[2].subjects = new Subject[1];
		
		studentList[2].subjects[0] = new Subject();
		
	}

}
