
public class Bank {

	private static int intial;
	private static int profit =0;
	private static int loss =0;
	private static int rounds=0;
	
	public void bank(){
		
	}
	
	
	public static void setBank(int n){
		intial=n;
	}
	
	public static int getBank(){
		return intial;
	}
	
	public static void addBank(int n){
		intial+=n;
	}
	
	public static int getProfit(){
		return profit;
	}
	
	public static void addProfit(int n) {
		profit+= n;
	}
	
	public static int getLoss(){
		return loss;
	}
	
	public static void addLoss(int n) {
		loss+= n;
	}


	public static int getRounds() {
		return rounds;
	}


	public static void setRounds() {
		rounds++;
	}
	
	
}
