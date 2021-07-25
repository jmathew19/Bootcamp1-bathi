import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Welcome, type the string in alphabetical order that will be printed" );
		System.out.println("");
		System.out.println("your score is "+ScoreKeeper.getScore());
		System.out.println("your time limit for each answer is " +  ScoreKeeper.getTime() / 1000
				+ " seconds");
		System.out.println("Click 'ENTER' to start the game");
		
		Scanner Start = new Scanner(System.in);
		String startGame = Start.nextLine();  // start game
		System.out.println("READY?...");	
		TimeUnit.SECONDS.sleep(1);
		System.out.println("SET");	
		TimeUnit.SECONDS.sleep(1);
		System.out.println("GO!!!!!!");	
		
		Game.playGame( ScoreKeeper.getScore());
		

	    
	    
	    
//	    System.out.println("your score is now   " + ScoreKeeper.getScore() );
	    
	    
	    	
	    	
	    
	   
	    
	    

	    
	    
	}
}
