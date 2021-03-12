package step7_01.classArray;


class Client {
	
	String name;
	int score;
	
	void setData(String name, int score ) {
		
		this.name = name;
		this.score = score;
		
		
	}
	
	void printData() {
		
		System.out.println(this.name + " / " + this.score);
	
	}
}


public class ClassArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client[] clientList = new Client[3];
		
		for (int i = 0; i < clientList.length; i++) {
			
			clientList[i] = new Client();
			
		}
		
		
		clientList[0].setData("제임스 고슬링", 100);
		clientList[1].setData("데니스 리치", 100);
		clientList[2].setData("팀 버너스 리", 100);
		
		
		for (int i = 0; i < clientList.length; i++) {
			
			clientList[i].printData();
		}
		
		
	}

}
