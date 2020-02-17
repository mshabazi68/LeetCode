import java.util.Arrays;

public class IsPlindrome {

	public boolean isPlindrome(int x) {

		if (x < 0) {
			return false;
		}
		String str = Integer.toString(x);
		char[] myChar = str.toCharArray();
		int last = myChar.length - 1;
		for (int c=0; c< myChar.length/2; c++) {
			if (myChar[c] != myChar[last - c]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		IsPlindrome obj = new IsPlindrome();

		System.out.println(obj.isPlindrome(10));
	}

}
