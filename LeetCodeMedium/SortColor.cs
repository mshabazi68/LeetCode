 
 /*
 Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
 */
 
 
 public void SortColors(int[] A)
        {
            for (int start = 0, end = A.Length - 1, i = start; i <= end;)
            {
                if (A[i] == 0)
                {
                    if (i == start)
                    {
                        i++;
                        start++;
                    }
                    else
                    {
                        Utility.Swap(ref A[i], ref A[start++]);      
                    }
                }
                else if (A[i] == 1)
                {
                    i++;
                }
                else
                {
                    Utility.Swap(ref A[i], ref A[end--]);
                }
            }
        }
    }
