
public class ValidAnagram242 {
	public boolean isAnagram(String s, String t) {
		char[] char_count = new char[26];

		if (s.length() != t.length()) {
			return false;
		}
		
		for (int i = 0; i < s.length(); i++) {
			char_count[s.charAt(i) - 'a']++;
			char_count[t.charAt(i) - 'a']--;

		}
		for (int c : char_count) {
			if (c != 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		String s = "the";
		String t = "hte";
		ValidAnagram242 obj = new ValidAnagram242();
		System.out.println(obj.isAnagram(s, t));

	}
}

/*
 * This solution does not work becuase the sum of the all character will be the
 * same eg: ac == bb we need to map the
 * 
 * public int getUnicodeValue (String str) { //char temparr [] =
 * str.toCharArray(); int total=0; for(int i=0; i<str.length(); i++) { total =
 * total + str.codePointAt(i); } return total; } public boolean isAnagram(String
 * s, String t) { int first = getUnicodeValue(s); int second =
 * getUnicodeValue(t);
 * 
 * if(first == second) { return true; }else { return false; } }
 */