package step7_01.classArray;

import java.util.Scanner;

class User1{
	
	String id; 
	int money;
	
}


public class ClassArrayEx04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		final int MAX_NUM = 3;
		
		User1[] user1 = new User1[MAX_NUM];
		
		for (int i=0; i<MAX_NUM; i++) {
			user1[i] = new User1();
		}
		
		user1[0].id = "qwer1234";
		user1[0].money = 1000;
		
		user1[1].id = "asdf1234";
		user1[1].money = 2000;
		
		int userCnt = 2;
		
		for (int i = 0; i < userCnt; i ++) {
			System.out.println(user1[i].id + " " + user1[i].money);
		}
		
		User1 temp = user1[1];
		temp.id = "zxcv1234";
		System.out.println("=====================================");
		
		for (int i = 0; i < userCnt; i ++) {
			System.out.println(user1[i].id + " " + user1[i].money);
		}

		scan.close();


	}

}
