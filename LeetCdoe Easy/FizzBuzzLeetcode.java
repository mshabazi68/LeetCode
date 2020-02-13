import java.util.ArrayList;
import java.util.List;

public class FizzBuzzLeetcode {
	 public List<String> fizzBuzz(int n) {
	        // if num %3==0  Fizz 
		 	// if num %5==0  Buzz 
		 	// if both fizz buzz 
		 List <String> mylist = new ArrayList <String>();
		int i = 1
				;
		 while (i <= n) {
		 if ( i % 3 == 0 && i%5==0)
		 {
			mylist.add("FizzBuzz"); 
			 
		 }else if (i % 3==0 ) {
			 mylist.add("fizz");
		 }else if ( i %  5 == 0) {
			 mylist.add("Buzz");
		 }else 
			 mylist.add(Integer.toString(i));
			 i++;
			// return mylist;
	    	}
		return mylist;
		}
	
	 public static void main (String args[] ) {
		 FizzBuzzLeetcode obj = new FizzBuzzLeetcode ();
		 int num  = 15;
		 System.out.println(obj.fizzBuzz(num));
	 }
}
