
public class ScoreKeeper {
	public static long score=5000;
	public static long time=10000;
	public static long scoreLimit=10000;
	
	public ScoreKeeper(long score) {
		this.score=1000;
		this.time=1000;
		
	}
	
	
	public static void overtime(long s){
			
		s/=10;	
			
		 score-=s;
		
	}
	
	
	public static void offset(String guess, String actual){
			if(guess.equals("")) {
				guess = " ";
			}
			String small="";
			String big="";
			int tot=0;
			String empty=" ";
			if(guess.length()>actual.length()) {
				big=guess;
				small=actual;
			}else {
				big=actual;
				small=guess;
			}
			

			tot=0;
			for(int i=0;i<big.length();i++) {
				if(i<small.length()) {
					tot += Math.abs(small.charAt(i)-big.charAt(i));
				}else {
					tot += Math.abs(empty.charAt(0)-big.charAt(i));
				}
			}
			
			//System.out.println("the offset value is beta2"+ ":  "+ tot);
			
			score-=tot;
		
	}
	
	
	public static void addPoints() {

		score+=500;
	}
	
	
	public static  long getScore() {
		
		return score;
	}
	
	
	
	public static long getTime() {
		return time;
	}
	
	public static long getScoreLimit() {
		return scoreLimit;
	}



	
	
	
}
