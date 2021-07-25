import java.util.Arrays;

public class SortWord {

	
	
	public static String sortWord(String str) {
		

		int[] alpha= new int[58];

	    for(int i=0;i<str.length();i++){
	      alpha[str.charAt(i)-65]++;
	    }
		

	    
	    str="";
	    for(int i=0; i<alpha.length;i++){
	        for(int j=0; j<alpha[i];j++)
	          str+=(char)(i+65);
	      }

	     
	    
	    return str;
	}
	
	
}
