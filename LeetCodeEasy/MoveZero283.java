
public class MoveZero283 {
	
	 public void moveZeroes(int[] nums) {
	     int index = 0;
	     // from the beginning of the array find the none zeros and placed it at the ith positions 
	     for ( int i=0; i<nums.length; i++) {
	    	 if ( nums[i] != 0) {
	    		 nums[index++] = nums[i];
	    	 }
	     }
		 // Starting the i form the last index of the number that has been placed 
	     for ( int i = index; i<nums.length; i++) {
	    	 nums[i] = 0;
	     }
		 
		 
	    }

	public static void main(String[] args) {
		MoveZero283 obj = new MoveZero283();
		int nums [] = {0,1,0,3,12};
		obj.moveZeroes(nums);
	}

}
