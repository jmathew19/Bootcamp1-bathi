public class RandString {
	
	
	public static String getRandString() {
		String whole = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
		//String whole="AAABBBB";
		String fin="";
		
		while(fin.length()<7) {
			
			fin+= whole.charAt((int) Math.floor(Math.random()*52));
			//fin+= whole.charAt((int) Math.floor(Math.random()*6));
			
		}
		
	    return fin;
		
	}
}

