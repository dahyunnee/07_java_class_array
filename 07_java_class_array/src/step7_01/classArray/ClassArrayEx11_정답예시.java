package step7_01.classArray;


// 문자열(1단계) [정답]

class StudentList{
	
	String name;
	int score;
	
	void print() {
		System.out.println(this.name + " : " + this.score);
	}
	
}

public class ClassArrayEx11_정답예시 {

	public static void main(String[] args) {
		
		String data = "3\n"; 			// studentList의 크기
		data +="김영희/30\n";			// 이름/성적
		data += "이만수/40\n";
		data += "이철민/60";
		
		StudentList[] st;
		//문제) data에 있는 내용을 잘라서 st에 저장후 출력 하시오.
	
		String[] temp = data.split("\n");
		int size = Integer.parseInt(temp[0]);
		
		st = new StudentList[size];
		for (int i=0; i<size; i++) {
			st[i] = new StudentList();
		}
		
		for (int i=0; i<size; i++) {
			String[] info = temp[i+1].split("/");
			
			st[i].name = info[0];
			st[i].score = Integer.parseInt(info[1]);
			
			st[i].print();
		}
		System.out.println();
		

	}

}
