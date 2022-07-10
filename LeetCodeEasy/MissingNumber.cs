//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array. 
//Input: nums = [3,0,1]  Output: 2


public class Solution {
   public int MissingNumber(int[] nums)
{
    var result = nums.Length;
    var i = 0;
    foreach (var num in nums)
    {
        result ^= num;
        result ^= i;
        i++;
    }

    return result;
   }
}
