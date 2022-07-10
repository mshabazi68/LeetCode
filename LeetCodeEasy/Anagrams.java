
public class Anagrams {
	public boolean isAnagram(String s, String t) {
		// becasue we have 26 character in the English alphabet 
		char [] char_count = new char[26];
		
		if ( s.length() != t.length()) return false;
		
		
		for ( int i =0; i<s.length(); i++) {
			char_count[s.charAt(i) - 'a'] ++;
			// count if the number of char is the same the result will be 0
			char_count[t.charAt(i) - 'a'] --;
		}
		
		for ( int c: char_count) {
			if ( c != 0) { return false;}
		}
		return true;
		
	}

	public static void main(String[] args) {

	}

}
