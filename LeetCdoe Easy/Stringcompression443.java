
public class Stringcompression443 {
	/*
	public int compress ( char [] chars) {
		int index =0; 
		int i = 0; 
		while (i<chars.length) {
			int j=i;
			while (j<chars.length && chars[j]== chars[i]) {
				j++;
			}
			chars[index++]= chars[i];
			if (j-i>1) {
				String count = j-i + "";
				for ( char c : count.toCharArray()) {
					chars[index++]= c;
				}
			}
			i=j;
		}
		return index;
	}*/
	
	public int compress (char [] chars) {
		int start=0;
		for ( int end=0, count =0; end<chars.length; end++) {
			count++;
			if ( end == chars.length-1 || chars[end] != chars[end +1]) {
				chars[start]= chars[end];
				start ++;
				if (count != 1) {
					char[] arr=String.valueOf(count).toCharArray();
					for ( int i=0; i<arr.length; i++, start++) {
						chars[start] = arr[i];
					}
					;
				}
				count =0;
			}
			
		}
		return start;
	}

	public static void main(String[] args) {
		Stringcompression443 obj =new Stringcompression443();
		char mychar[]  = {'a','a','b','b','c','c','c'};
		System.out.println(
		obj.compress(mychar));

	}

}
