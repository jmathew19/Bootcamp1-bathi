import java.util.Scanner;

public class Game {
	
	public static Scanner input = new Scanner(System.in);
	private static int diamonds =0;
	private static int clubs =0;
	private static int hearts =0;
	private static int spades =0;
	
	public static void playGame(){
		
		System.out.println("your bank total is "+ Bank.getBank() );
		
		Deck myDeck = new Deck();
		myDeck.shuffle();
		
		
		
		while(Bank.getBank()>0) {
			
			
			Card card1 = myDeck.dealCard();
			Card card2 = myDeck.dealCard();
		
			System.out.println( "your first card is: " + card1.toString());
			System.out.println( "your second card is: " + card2.toString());
		
			System.out.println();
			//guessing location
			System.out.println( "Type your guess below if the thrid card is 'before', 'between', 'after' the cards given");
			String location = input.nextLine(); 
			
			//betting
			System.out.println("you have $" + Bank.getBank()+ "  right now, how much money are you willing to bet your guess is correct?");
			String bet = input.nextLine(); 
		
		
			//store value of third card
			Card card3 = myDeck.dealCard();
			
		
			boolean outcome = outcomeOfGuess(location, card1, card2, card3);
			//System.out.println(outcome);
			
			setStats(outcome,bet,card1,card2,card3);
			

		
		}
		
		
			/*
			 * create end game stats here
			 * how many of each suit 
			 * how much money profit
			 */
		
			stats();
			
	}
	
	
	public static boolean outcomeOfGuess(String location, Card card1, Card card2, Card card3) {
		
		double max= Card.getMaxValue(card1, card2);
		double min= Card.getMinValue(card1, card2);
		double car3=card3.getCardValue();
		
		
		System.out.println( "card 3 was "+ card3.toString());
		
		if( location.equals("before") ) {
			if(car3<min) {
				System.out.println("ur right");
				return true;
			}else {
				System.out.println("ur wrong");
				return false;
			}
		}else if( location.equals("between") ) {
			if(car3>min && car3<max) {
				System.out.println("ur right");
				return true;
			}else {
				System.out.println("ur wrong");
				return false;
			}
		}else if( location.equals("after") ) {
			if(car3>max ) {
				System.out.println("ur right");
				return true;
			}else {
				System.out.println("ur wrong");
				return false;
			}
			
		}
		
		return false;
		
		
	}
	
	
	public static void setStats(boolean outcome, String bet, Card card1, Card card2, Card card3) {
		if(outcome==true) {
			Bank.addBank(Integer.parseInt(bet));
			Bank.addProfit(Integer.parseInt(bet));
		
		}else{
			Bank.addBank(-1*Integer.parseInt(bet));
			Bank.addLoss(Integer.parseInt(bet));
		}
		
		suitCount(card1);
		suitCount(card2);
		suitCount(card3);
		
		Bank.setRounds();
		System.out.println("");
		System.out.println( "your bank total is $"+ Bank.getBank());
		System.out.println("");
	}
	
	
	public static void stats() {
		System.out.println("");
		System.out.println("");
		System.out.println("GAME OVER");
		System.out.println("=========================================================");
		System.out.println("you have played " + Bank.getRounds() + " rounds");
		System.out.println("");
		System.out.println("the total amount of money you have WON: $" + Bank.getProfit() );
		System.out.println("");
		System.out.println("the total amount of money you have LOST: $" + Bank.getLoss() );
		System.out.println("");
		System.out.println("Spades appeared " + spades + " times");
		System.out.println("");
		System.out.println("hearts appeared " + hearts + " times");
		System.out.println("");
		System.out.println("clubs appeared " + clubs + " times");
		System.out.println("");
		System.out.println("diamonds appeared " + diamonds + " times");
		
		
	}
	
	public static void suitCount(Card card) {
		
		if( card.getSuit()==3) {
			spades++;
		}
		if( card.getSuit()==2) {
			hearts++;
		}
		if( card.getSuit()==1) {
			clubs++;
		}
		if( card.getSuit()==0) {
			diamonds++;
		}
	}
	
	
	
}
