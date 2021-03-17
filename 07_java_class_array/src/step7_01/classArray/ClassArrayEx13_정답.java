package step7_01.classArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class StudentEx{
	
	String id = "";
	String pw = "";
	
	void set_data(String id , String  pw) {
		this.id = id; 
		this.pw = pw;
	}
	
	
	void print_data() {
		System.out.println("이름 : " + id + " 비밀번호 : " + pw);
	}
	
}

class Manager{
	
	StudentEx [] list = null;
	int stdCnt = 0;
	
	void add_StudentEx(StudentEx st) {
		
		if (list == null) {		//list배열이 비어있는 경우
			
			list = new StudentEx[1];
			list[0] = st;
			
		}
			
		else {		//list배열에 StudentEx 객체 존재하는 경우
			
			StudentEx[] temp = list;
			list = new StudentEx[stdCnt + 1];
			
			for (int i = 0; i < temp.length; i++) {
				
				list[i] = temp[i];
			}
			
			list[stdCnt] = st;
			
		}
		
		stdCnt ++;
	}
	
	StudentEx remove_StudentEx (int index) {
		
		StudentEx student = list[index];
		
		if (stdCnt == 1) {
			
			list = null;
			stdCnt --;
		}
		else {
			
			int indexofList = 0;
			StudentEx[] temp = list;//1234 length = 4
			list = new StudentEx[stdCnt - 1];//124 index =2 
			
			for (int i = 0; i < index; i++) {	//index배열 전까지 옮기기
				
				list[indexofList ++] = temp[i];
			}
			
			for (int i = index +1; i < temp.length ; i++) {	//index이후 옮기기
				
				list[indexofList ++] = temp[i];
			
			}
			
			stdCnt --;
		}
		
		return student;
	}
	
	int check_id(StudentEx st) {
		
		boolean isOverlapped = false;
		int overlappedIndex = -1;
		
		for (int i = 0; i < stdCnt; i++) {
			
			if (list[i].id.equals(st.id)) {
				
				isOverlapped = true;
				overlappedIndex = i;
				
				break;
			}
		}
		
		if ( isOverlapped == true) {
			
			return overlappedIndex;		//중복된 id 존재시 인덱스반환
		}
		
		else return -1;		//중복아니면 -1 반환
		
	}
	
	void print_StudentEx() {
		
		for (int i = 0; i < list.length; i++) {
			
			list[i].print_data();
		}
		
	}	
	
	String out_data() {
		
		String str  = "";
		
		
		
		if (stdCnt == 0) return str;
		
		else {
			str += stdCnt + "\n";
		
			for (int i = 0; i < list.length; i++) {
				
				str += list[i].id + "," + list[i].pw + "\n";
	
			}
			
		}
		
		return str;
	}
	
	void sort_data() {
		
		StudentEx temp ;
		for (int i = 0; i < list.length; i++) {
			
			for (int j = i+1; j < list.length; j++) {
				
				if (list[i].id.compareTo(list[j].id) > 0) {
					
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
					
				}
			}
			
		}
		
	}
	
	void load_StudentEx (StudentEx [] temp , int count) {
		
		this.list = temp;
		this.stdCnt = count;
	}
	
}


public class ClassArrayEx13_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Manager manager = new Manager();
		
		while (true) {
			
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt();
			
			/*
			 * [1] 가입하기 : ID 중복검사 구현
			 * [2] 탈퇴하기 : ID를 입력받아 탈퇴
			 * [3] 정렬하기 : 이름을 국어사전 순으로 정렬
			 * [4] 출력하기 : 데이터들을 화면에 출력
			 * [5] 저장하기 : 아래와 같은 형식으로 저장
			 * [6] 불러오기 : 파일에 저장된 내용을 불러오기
			 * [7] 종료하기 : 반복문을 종료
			 * 
			 * 			예) 
			 * 			2				// 회원 수
			 *			qwer,1234		// id,pw	
			 *			abcd,1111		// id, pw
			 */
			
			if		(sel == 1) {//checkid와 add_studentEx 사용
				
				System.out.println("[가입절차]");
				System.out.print("[ID] : ");
				String getId = scan.next();
				
				StudentEx student = new StudentEx();
				student.id = getId;
				
				//중복 id 존재하는 경우
				if ( -1 != manager.check_id(student)) {
					
					System.out.println(manager.list[manager.check_id(student)].id + "는 존재하는 아이디 입니다.");
					continue;
				}
				
				System.out.print("[PW] : ");
				student.pw = scan.next();
				
				manager.add_StudentEx(student);
				
				
			}
			else if (sel == 2) {
				
				System.out.println("[탈퇴절차]");
				System.out.print("[ID] : ");
				
				StudentEx temp = new StudentEx();
				temp.id = scan.next();
				
				if ( manager.check_id(temp) == -1 ) {		//존재하지 않는 아이디
					
					System.out.println("존재하지 않는 아이디입니다.");
					continue;
				}
				
				//존재하는 경우 탈퇴진행
				
				System.out.print("[PW] : ");
				if ( manager.list[manager.check_id(temp)].pw.equals(scan.next())) {
					
					StudentEx removedStudent = manager.remove_StudentEx(manager.check_id(temp));
					System.out.println(removedStudent.id + " 탈퇴 성공");
				}
				
				else System.out.println("비밀번호가 잘못되었습니다.");
				
				
				
			}
			else if (sel == 3) {
				
				System.out.println("[ID순서로 정렬]");
				manager.sort_data();
				
				manager.print_StudentEx();
				
			}
			else if (sel == 4) {
				
				manager.print_StudentEx();
				
			}
			else if (sel == 5) {
				

				FileWriter fw = null;
				
				try {
					fw = new FileWriter("StudentList.txt");
					
					fw.write(manager.out_data());
				} catch (IOException e) {e.printStackTrace();}
				finally {
					try {fw.close();} catch (IOException e) {e.printStackTrace();}
				}
				
			
				
			}
			else if (sel == 6) {
				
				File file = new File("StudentList.txt");
				FileReader fr = null;
				BufferedReader br = null;
				
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					
					int countStudent = Integer.parseInt(br.readLine());
					
					StudentEx[] temp = new StudentEx[countStudent];
					
					int indexofTemp = 0;
					
					System.out.println(countStudent);
					while (true) {
					
						String str = br.readLine();
						if (str == null) break;
						
						System.out.println(indexofTemp);
						temp[indexofTemp] = new StudentEx();
						temp[indexofTemp].id = str.split(",")[0];
						temp[indexofTemp].pw = str.split(",")[1];
						
						indexofTemp ++;
					}
					
					manager.load_StudentEx(temp, countStudent);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
			else if (sel == 7) { 
				break; 
			}
			System.out.println("\n");
			
		}

	}

}
