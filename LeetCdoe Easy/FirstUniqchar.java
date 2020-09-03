import java.util.HashMap;

public class FirstUniqchar {
/*Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
 * 
 * */
	public int finduniqchar (String s) {
		HashMap<Character, Integer > mymap = new HashMap<Character , Integer >();
		for (int i=0; i<s.length(); i++) {
			char curr = s.charAt(i);
			
			if ( ! mymap.containsKey(curr)) {
				mymap.put(curr , i);
				
			}else {
				mymap.put(curr, -1);
			}
			
		}
		int min = Integer.MAX_VALUE; 
		for (char c:mymap.keySet()) {
			if (mymap.get(c)>-1 && mymap.get(c)<min) {
				min = mymap.get(c);
			}
		}
		return min == Integer.MAX_VALUE ? -1 :min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
