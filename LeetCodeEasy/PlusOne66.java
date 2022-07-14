import java.util.Arrays;

public class PlusOne66 {
	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i] = digits[i] + 1;
				return digits;
			}
			digits[i] = 0;
			//System.out.println(Arrays.toString(digits));
		}
		int result[] = new int[digits.length + 1];
		result[0] = 1;
		//System.out.println(Arrays.toString(result));
		return result;

	}

	public static void main(String[] args) {
		
		PlusOne66 obj = new PlusOne66();
		int[] digits = { 1, 2, 9 };
		System.out.println(Arrays.toString(obj.plusOne(digits)));
	}

}
