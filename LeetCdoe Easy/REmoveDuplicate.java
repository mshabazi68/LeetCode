import java.util.HashMap;

public class REmoveDuplicate {

	public int removeDuplicates(int[] nums) {
		int index = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[index++] = nums[i + 1];
			}
		}

		return index;

	}

	public static void main(String[] args) {
		REmoveDuplicate obj = new REmoveDuplicate();
		// TODO Auto-generated method stub
		int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(obj.removeDuplicates(arr));
	}

}
