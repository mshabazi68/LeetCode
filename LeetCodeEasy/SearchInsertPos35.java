import java.util.HashMap;

public class SearchInsertPos35 {

	public int searchInsert(int[] nums, int target) {
		/*
		 * HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
		 * 
		 * for (int i=0; i<nums.length; i++) { if ( !map.containsKey(i)) {
		 * map.put(nums[i],i ); } }
		 */
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (nums[i] == target) {
				return i;
			}
			if (nums[i] < target && target < nums[i + 1]) {
				return i + 1;
			} else if (target < nums[0]) {
				return 0;
			} else if ((target> nums[len-1])) {
				return len ;
			}
		}
		return -1;
	}

	public static void main(String arg[]) {
		SearchInsertPos35 obj = new SearchInsertPos35();

		int arr[] = { 1, 3, 5, 6 };
		int target = 7;

		System.out.println(obj.searchInsert(arr, target));
	}
}
