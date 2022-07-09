import java.util.Arrays;

public class RunningSumOfArray1480 {

	public int[] runningSum(int[] nums) {
		int result =0;
		int newNums[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			result = result + nums[i];
			newNums[i] = result;
			//System.out.println(Arrays.toString(newNums));
		}
		return newNums;
	}

	public static void main(String[] args) {
		RunningSumOfArray1480 obj = new RunningSumOfArray1480();

		int nums[] = { 1, 2, 3, 4 };
		System.out.println(
		Arrays.toString(obj.runningSum(nums)));
	}

}
