
public class LongestCommon14 {

	 public String longestCommonPrefix(String[] strs) {
		 boolean flag = true;
		 int i=0;
		 int pos= 1; 
		 String result= "";
		 int count= 0;
		 int min = Integer.MAX_VALUE;
		 if (strs == null) {
			 System.out.println("Empty Input @Error");
		 }
		 for ( int j=0; j<strs.length; j++) {
			 if ( strs[j].length() <min) {
				 min = strs[j].length();
			 }
			 int x= 4;
			 int mysqrt=   (int) Math.sqrt((double)(x));
			 System.out.println(mysqrt);
		 }
		/* while (pos<strs.length ) {
			 if ( strs[0].charAt(i) == strs[pos].charAt(i) && i<=min) {
				 count++;
				 i++;
				 pos++;
				
			 }else 
				 flag = false;
		 }
		// result= strs[0].substring(0, count);
		 return result= (count != 0 ) ? strs[0].substring(0, count) : "";
		 
		 
		
	// return result = "poop";       
		*/return result;
	    }
	public static void main(String[] args) {
		LongestCommon14 obj = new LongestCommon14();
 String [] strs = {"cris" , "cristiane" , "cristi"};
		 //{"dog","racecar","car"};
	 //{"flower","flow","flight"};
 System.out.println(obj.longestCommonPrefix(strs));
 //System.out.println(strs[0].charAt(0));
	}

}
