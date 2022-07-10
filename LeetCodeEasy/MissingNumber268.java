package LeetCode;

import java.util.HashSet;

public class MissingNumber268 {

	public int missingnumber(int nums[]) {
		HashSet<Integer> set  = new HashSet<Integer>();
		
		for(int i:nums) {
			set.add(i);
		}
		
		for ( int i=0; i<=nums.length;i++) {
			if (! set.contains(i)) {
				return i;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		 MissingNumber obj = new  MissingNumber ();
		 
		int nums[] = { 3,0,1};
		
		System.out.println(
		 obj.missingnumber(nums));

	}

}
