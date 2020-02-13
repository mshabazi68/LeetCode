import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	 public static boolean isHappy_number(int num)
	    {
	        Set<Integer> unique_num = new HashSet<Integer>();

	        while (unique_num.add(num))
	        {
	            int value = 0;
	            while (num > 0)
	            {
	                value += Math.pow(num % 10, 2);
	               // System.out.println("my num is " +num);
	                num /=10;
	             //   System.out.println("Test num " +num);
	            }
	            num = value;
	        }
	        System.out.println(unique_num);

	        return num == 1;
	    }


	// Driver code to test above methods
	public static void main(String[] args) {
		int n = 19;
		if (isHappy_number(n))
			System.out.println(n + " is a Happy number");
		else
			System.out.println(n + " is not a Happy number");
	}
}
