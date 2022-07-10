import java.util.Arrays;

public class premutationTwoWord {
// if we can use the library 
	/*
	public boolean isPremut(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false ; 
		}
		
		char ch1[] = s1.toLowerCase().toCharArray();
		char ch2[] = s2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for ( int i=0; i<s1.length(); i++) {
			if(ch1[i] != ch2[i]) {
				return false;
			}
			
			
		}
		return true;
	}
	*/
	
	public boolean isPermut (String s1 , String s2) {
		int m = s1.length();
		int n = s2.length();
		
		if ( m != n) return false;
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		int [] freq = new int [26];
		for (int i=0; i<m; i++) {
			char curr = s1.charAt(i);
			int index = curr -'a';
			freq [index]++;
		}
		
		for (int i=0; i<n; i++) {
			char curr = s2.charAt(i);
			int index = curr - 'a';
			freq [index] --;
		}
		for ( int i=0; i<26; i++) {
			if (freq[i] !=0 ) return false;
			
		}
		return true;
	}
	public static void main (String args []) {
		premutationTwoWord obj =new  premutationTwoWord();
		
		System.out.println(
		obj.isPermut("abcd", "dcBa"));
	}
}
