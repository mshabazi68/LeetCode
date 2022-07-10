import java.util.ArrayList;


public class IsPalindromValid {

	public boolean IsPalindrom(String str) {
		if (str == "") {
			return true;
		}
	

		char mychar[] = str.toCharArray();
		ArrayList<Character> mylist = new ArrayList<Character>();
		for (char i : mychar) {
			if (Character.isLetterOrDigit(i)) {
				mylist.add(Character.toLowerCase(i));
				System.out.println(mylist );
			}
		}

		int c = 0;
		int last = mylist.size() - 1;
		while (c < mylist.size() / 2) {
			System.out.println(mylist.get(c));
			System.out.println(mylist.get(last - 1));
			if (mylist.get(c) != (mylist.get(last - c))) {
				return false;
			}
			c++;
		}
		return true;

	}

	public static void main(String[] args) {
		IsPalindromValid obj = new IsPalindromValid();
		String str = "0P";

		System.out.println(obj.IsPalindrom(str));

	}

}
