package step7_01.classArray;

import java.util.Random;

// 경마[정답]

class Horse{
	
	String name   = ""; 
	int pos       = 0; 
	int rank      = 0;
	boolean isWin = false;
	
}

class Racing{
	
	Random ran = new Random();
	
	int size = 4;
	Horse[] horses = new Horse[size];	
	int line = 20;
	int track [][] = new int[size][line];
	
	void run(){
		
		for(int i =0; i < size; i++) {
			horses[i] = new Horse();
		}
		
		horses[0].name = "a";
		horses[1].name = "b";
		horses[2].name = "c";
		horses[3].name = "d";
	
		play();	
		printHorse();
		
	}
	
	
	
	void printHorse() {		
		System.out.println();
		for (int i =0; i < size; i++) {
			for (int n = 0; n < line; n++) {
				if (horses[i].pos == n) 	System.out.print("["+horses[i].name+"]");
				else 						System.out.print("[ ]");
			}
			System.out.println();
		}
	}
	
	
	
	void play() {
		
		boolean isRunning = true;
		int finishCount = 0;
		
		while (isRunning) {
			
			printHorse();
			
			for (int i = 0; i < size; i++) {
				
				if (horses[i].isWin == true) continue;
				
				int r = ran.nextInt(4) + 1;
				horses[i].pos += r;
				
				if (horses[i].pos >= 19) {
					horses[i].pos = 19;
					horses[i].rank = finishCount + 1;
					horses[i].isWin = true;
					finishCount++;
					if (finishCount >= size) {
						isRunning = false;
						break;
					}
				}
				
			}
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			
		}
		
	}
}


public class ClassArrayEx10_정답예시 {

	public static void main(String[] args) {
		
		new Racing().run();

	}

}
