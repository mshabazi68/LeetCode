import java.util.Arrays;

public class RotateArray189 {

//	public void rotate(int[] nums, int k) {
//		int count = 0;
//		int len = nums.length - 1;
//		int temp = 0;
//		while (count < k) {
//			for (int i = len; i > 0; i--) {
//				// System.out.println(nums[i]);
//				temp = nums[i];
//				nums[i] = nums[i - 1];
//				nums[i - 1] = temp;
//			}
//			count++;
//		}
//		// System.out.println(Arrays.toString(nums));
//	}

	public void rotate(int[] nums, int k) {

		k = k % nums.length;

		reverse(nums, 0, nums.length - 1);
		System.out.println("Original " + Arrays.toString(nums));
		reverse(nums, 0, k - 1);
		System.out.println("The first half rotate " + Arrays.toString(nums));
		reverse(nums, k, nums.length - 1);

		System.out.println("The rest of array " + Arrays.toString(nums));

	}

	public void reverse(int[] nums, int start, int end) {
		// end = nums.length-1;
		// start=0;
		while (start < end) {
			int temp = nums[end];
			nums[end] = nums[start];
			nums[start] = temp;
			end--;
			start++;
		}
		// System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		RotateArray189 obj = new RotateArray189();

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		// obj.reverse(arr, 0, arr.length - 1);
		obj.rotate(arr, k);

	}

}
