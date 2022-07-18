public class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> app = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i ++) {
            if (app.contains(nums[i])) {
                app.remove(nums[i]);
            }
            else {
                app.add(nums[i]);
            }
        }
        int[] result = new int[2];
        Iterator<Integer> it = app.iterator();
        result[0] = it.next();
        result[1] = it.next();
        return result;
    }
}
