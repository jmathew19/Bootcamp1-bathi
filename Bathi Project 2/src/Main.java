import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		System.out.println("Welcome to your new gambling addiction where the profits mean as much as ur life");
		System.out.println("");
		System.out.println("im too lazy to explain the rules bathi u know what to do");
		System.out.println("Tell me how much money are you bringing the table?");
		Scanner pot = new Scanner(System.in);
		String startGame = pot.nextLine(); 
		Bank.setBank(Integer.parseInt(startGame));
		Game.playGame();
	
	}
		

}
////Scanner thirdcard = new Scanner(System.in);
////String third = thirdcard.nextLine();  // start game
//
//Card card3 = myDeck.dealCard();
//
//int max;
//int min;
//
//if(card1.getValue() < card2.getValue()) {
//min = card1.getValue();
//max = card2.getValue();
//}else {
//max = card1.getValue();
//min = card2.getValue();
//}
//int c1 = card1.getSuit();
//int c2 = card2.getSuit();
//
//System.out.println("Card1 suit is:  " + card1.getSuit());
//System.out.println("max is:  "+ card2.getSuit());

//less than
//if(card3.getValue() < min  ) {
//if(third.equals("before") ) {
//	System.out.println("ur right");
//}else {
//	System.out.println("ur wrong");
//}
//}
////greater than
//else if(card3.getValue() > max  ) {
//if(third.equals("after") ) {
//	System.out.println("ur right");
//}else {
//	System.out.println("ur wrong");
//}
//}else {// between
//if(third.equals("between") ) {
//	System.out.println("ur right");
//}else {
//	System.out.println("ur wrong");
//}
//}
//
//System.out.println("------------------------------------------------------------------------------");
//System.out.println("------------------------------------------------------------------------------");
//System.out.println("third card is  " + card3.toString() );
//
//