package step7_01.classArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class StudentVO {
	String id;
	String pw;
	
	void printArray() {
		
		System.out.println("[ID] : " + this.id + ", [PW] : " + this.pw);
	}
	
	
}

class StudentManager {
	
	ArrayList<StudentVO> studentList = new ArrayList<StudentVO>();
	int countStudent = 0;
	
	int checkId (StudentVO student) {
		
		for (int i = 0; i < countStudent; i++) {
			
			if (student.id.equals(studentList.get(i).id)) {
				
				return i;
			}
		}
		
		return -1;
	}
	
	void joinStudent(StudentVO student) {
		
		studentList.add(student);
		countStudent ++;
		
	}
	
	void withdrawStudent(StudentVO student, int index) {
		
		studentList.remove(index);
		countStudent --;
	}
	
	void sortStudentArray() {
	
		if(countStudent == 0) return;
		for (int i = 0; i < studentList.size() - 1; i++) {
			
			for (int j = i; j < studentList.size(); j++) {
				
				if (studentList.get(i).id.compareTo(studentList.get(j).id) > 0) {
					
					StudentVO temp = studentList.get(i);
					studentList.set(i, studentList.get(j));
					studentList.set(j, temp);
					
				}
			}
		}
		
	}
	
	void printStudentArray() {
		
		for (int i = 0; i < countStudent; i++) {
			
			studentList.get(i).printArray();
			
		}
	}
	
	String writeFile() {
		
		String str = "";
		
		if (countStudent == 0) return str;
		
		str += countStudent + "\n";
		for (int i = 0; i < countStudent; i++) {
			
			str += studentList.get(i).id + "/" + studentList.get(i).pw + "\n";
		}
		
		return str;
	}
	
	void setData(ArrayList<StudentVO> student, int count) {
		
		this.studentList = student;
		this.countStudent = count;
		
	}
	
}


public class ClassArrayEx23_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		StudentManager manager = new StudentManager();
		
		while (true) {
			
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt();
			
			if 		(sel == 1) {
				
				StudentVO temp = new StudentVO();
				
				System.out.println("[가입절차]");
				System.out.print("[ID] : ");
				temp.id = scan.next();
				
				if (manager.countStudent == 0) {
					
					System.out.print("[PW] : ");
					temp.pw = scan.next();
					manager.joinStudent(temp);				
					System.out.println("가입 성공");
		
					continue;
				}
				if (manager.checkId(temp) != -1) {
					
					System.out.println("이미 존재하는 ID 입니다.");
					continue;
				}

				System.out.print("[PW] : ");
				temp.pw = scan.next();
				manager.joinStudent(temp);				
				System.out.println("가입 성공");
				
			} 
			else if (sel == 2) {
				
				StudentVO temp = new StudentVO();
				
				System.out.println("[탈퇴절차]");
				System.out.print("[ID]: ");
				temp.id = scan.next();
				
				if (manager.checkId(temp) != -1) {
					
					System.out.println("[PW]: ");
					temp.pw = scan.next();
					
					if (temp.pw.equals(manager.studentList.get(manager.checkId(temp)).id)) {
						
						manager.withdrawStudent(temp, manager.checkId(temp));
						System.out.println("탈퇴 성공");
						
					}
					
					else {
						
						System.out.println("비밀번호 오류");
						continue;
					}
				}
				
				else {
					
					System.out.println("존재하지 않는 ID입니다. ");
				}
				
				
			}
			else if (sel == 3) {
				
				manager.sortStudentArray();
				manager.printStudentArray();
				
			}
			else if (sel == 4) {
				
				manager.printStudentArray();
			}
			else if (sel == 5) {
				
				FileWriter fw = null;
				
				try {
					
					fw = new FileWriter("studentList2.txt");
					fw.write(manager.writeFile());
					
				} catch (IOException e) {e.printStackTrace();} 
				finally {
					try {
						fw.close();
					} catch (IOException e) {e.printStackTrace();}
				}
				
				System.out.println("studentList2.txt 저장완료");
				
			}
			else if (sel == 6) {
				
				File file = new File("studentList2.txt");
				FileReader fr = null;
				BufferedReader br = null;
				
				
				try {
					
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					
					int countStudent = Integer.parseInt(br.readLine());
					ArrayList<StudentVO> tempStudentArray = new ArrayList<StudentVO>();
					
					while(true) {
						
						String str = br.readLine();
						
						if ( str == null) break;
						
						StudentVO tempStudent = new StudentVO();
						
						tempStudent.id = str.split("/")[0];
						tempStudent.pw = str.split("/")[1];
								
						tempStudentArray.add(tempStudent);
								
					}
					
					manager.setData(tempStudentArray, countStudent);
					manager.printStudentArray();
					
				} catch (Exception e) {e.printStackTrace();} 
				  finally {
					
					try {br.close();} catch (IOException e) {e.printStackTrace();}
					try {fr.close();} catch (IOException e) {e.printStackTrace();}
				}
			
				
			}
			else if (sel == 7) {
				
				System.out.println("종료");
				break;
			}
			
			System.out.println();
		}

	}

}
