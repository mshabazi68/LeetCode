import java.util.HashMap;

public class FirstChar387 {
	public int firstUniqChar(String s) {
		
		HashMap <Character , Integer > map = new HashMap <Character , Integer>();
		
		for (int i=0 ; i<s.length(); i++ ) {
			if ( !map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), i);
			}else {
			map.put(s.charAt(i), -1);
		}}
		System.out.println(map);
		int min =Integer.MAX_VALUE;
		for ( char c : map.keySet()) {
			if ( map.get(c)> -1 && map.get(c) <min) {
				min = map.get(c);
			}
		}
		return min = (min< Integer.MAX_VALUE) ? min : -1; 

	}

	public static void main(String[] args) {
		FirstChar387 obj = new FirstChar387();
		String str = "leetcode";
		System.out.println(obj.firstUniqChar(str));
	}

}
