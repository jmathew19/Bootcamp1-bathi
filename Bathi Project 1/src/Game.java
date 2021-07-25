import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {

	public static Scanner myObj = new Scanner(System.in);
	public static void playGame(long score){
		
		while(ScoreKeeper.getScore()>=0) {
			String str=RandString.getRandString();
			String sort =SortWord.sortWord(str);
			
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("The String is:");
			System.out.println(str);
			
			
			
			
			final long startTime = System.currentTimeMillis();
			String guess = myObj.nextLine();  // Read user input
		    final long endTime = System.currentTimeMillis();
		    long total= endTime - startTime;
		    System.out.println("");
		    System.out.println("ur guess took you "+ total/1000 +  " seconds");
		    
		    
		    //if your guess is right else wrong
		    if(guess.equals(sort)&& ScoreKeeper.getTime()<total) {
		    	System.out.println("Your guess was RIGHT!");
		    	ScoreKeeper.addPoints();
		    }else {
		    	System.out.println("Your guess was WRONG!");
		    	System.out.println("The correct answer was:  "+ sort);
		    	ScoreKeeper.offset(guess,sort);
		    }
		    
		    //if you are above the time limit
		    if(total>ScoreKeeper.getTime()) {
		    	System.out.println("You took too long to answer");
		    	ScoreKeeper.overtime(total-ScoreKeeper.getTime());
		    }
		    
		    System.out.println("");
		    System.out.println("Your score is:   " + ScoreKeeper.getScore());
		    System.out.println("");
		    
		    if(ScoreKeeper.getScore()<=0) {
		    	System.out.println("Your score fell below 0, the game is done");
		    	return;
		    }
		    if(ScoreKeeper.getScore()>=ScoreKeeper.scoreLimit) {
		    	System.out.println("Your score went above the limit of 10,000 , the game is done");
		    	return;
		    }
//		    Scanner Start = new Scanner(System.in);
		    System.out.println("click 'ENTER' to try the next word");
			String startGame = myObj.nextLine();
			System.out.println("READY?...");	
			
			
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("SET");	
			
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("GO!!!!!!");	
		}
		
		
		

	    
	}
}
