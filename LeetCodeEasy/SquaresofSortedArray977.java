import java.util.Arrays;

public class SquaresofSortedArray977 {

	public  int[] sortedSquares(int[] nums) {
		int posetive = nums.length-1;
		int negative= 0;
		int result [] = new int [nums.length];
		
		for ( int i=nums.length-1; i>=0; i--) {
			if (Math.abs(nums[negative])> nums[posetive]) {
				result[i]= nums[negative]*nums[negative];
				negative++;
			}else {
				result[i]=nums[posetive]* nums[posetive];
				posetive--;
			}
			
		}
		print(result);
		return result;
	}

	public void print(int [] nums) {
	
		System.out.println(Arrays.toString(nums));
	
}
	public static void main(String[] args) {
		SquaresofSortedArray977 obj = new SquaresofSortedArray977();
		int nums[] = { -4, -1, 0, 3, 10 };

	obj.sortedSquares(nums);
	obj.print(nums);
	}

}





