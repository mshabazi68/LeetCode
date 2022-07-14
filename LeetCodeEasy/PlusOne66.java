  import java.util.Arrays;

public class PlusOne66 {
	public int[] plusOne(int[] digits) {
		String num ="";
		for (int i=0; i<digits.length; i++) {
			 num = num + Integer.toString(digits[i]);
		}
		
		int temp = Integer.parseInt(num) +1;
		int count = 0;
		int n = temp;
		while (n != 0)
		{
		    n /= 10;
		    count++;
		}
		int numberArray[] = new int [count];
		if(count!=0){
			   

			   count = 0;    
			   n = temp;

			   while (n != 0){
			       numberArray[count] = n % 10;
			       n /= 10;
			       count++;
			   }
			}
		System.out.println(Arrays.toString(numberArray));
		return numberArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusOne66 obj = new PlusOne66();
		int [] digits = {1,2,3};
		System.out.println(obj.plusOne(digits));
	}

}
