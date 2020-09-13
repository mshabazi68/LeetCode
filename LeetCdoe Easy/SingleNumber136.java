import java.util.HashMap;


public class SingleNumber136 {
/*
	public int singleNumber(int[] nums) {
// using hash map to find if there is a duplicate is there or not 
		// key , value 
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			int curr = nums[i];
			if (!map.containsKey(curr)) {
				map.put(curr, i);
			} else {
				map.put(curr, Integer.MIN_VALUE);
			}
		}
		
		for ( int iteam : map.keySet()) {
			if ( !map.get(iteam).equals(Integer.MIN_VALUE)) {

				int index = map.get(iteam);
			return nums[index];
			}
		}
		System.out.println("This the set" + map);
		return -1;
	}*/
// using bit manipulation 
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result^=nums[i];
        }
        return result;
    }
	public static void main(String[] args) {
		SingleNumber136 obj = new SingleNumber136();
		int[] nums = {4,4,2,1,2};
		// char[] ch = { 'a', 'b', 'c', 'd' };
		System.out.println(obj.singleNumber(nums));

	}

}
