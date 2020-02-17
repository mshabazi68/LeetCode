import java.util.Arrays;

public class MergeSort {

	public int[] shiftright(int nums1[]) {
		int last = nums1[nums1.length - 1];

		for (int i = nums1.length - 2; i >= 0; i--) {
			nums1[i + 1] = nums1[i];
		}
		nums1[0] = last;
		return nums1;
	}

	public void swap(int arr[], int m, int arr2[], int n) {
		n--;
		m--;
		int i = arr.length - 1;
		while (i >= 0) {
			if (m < 0) {
				arr[i] = arr2[n--];
			} else if (n < 0) {
				arr[i] = arr[m--];
			} else {
				if (arr[m] > arr2[n]) {
					arr[i] = arr[m--];
				} else
					arr[i] = arr2[n--];
			}
			i--;
		}

		System.out.println("Array1 " + Arrays.toString(arr));
		System.out.println("Array2" + Arrays.toString(arr2));

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int j = m - 1;
		int i = n - 1;
		int last = nums1.length - 1;
		int count = 0;
		while (i > 0) {
			while (j >= 0) {
				if (j == 0 && i == 1) {
					if (nums1[0] > nums1[1]) {

					}
				}
				if (nums1[i] < nums2[j]) {

					nums1[last - count] = nums2[j];
					count++;
					j--;
				} else if (nums1[i] == nums2[j]) {
					// nums1[last-count] = nums1[i];
					count++;
					i--;
					nums1[last - count] = nums2[j];
					count++;
					j--;
				} else {
					nums1[last - count] = nums1[i];
					i--;

				}
			}

		}
		System.out.println("Array1 " + Arrays.toString(nums1));
		System.out.println("Array2" + Arrays.toString(nums2));

	}

	public static void main(String[] args) {
		MergeSort obj = new MergeSort();
		int num1[] = { 1, 0 };
		int num2[] = { 2 };

		// int num1[] = { 1, 2, 3, 0, 0, 0 };
		// int num2[] = { 2, 5, 6 };
		int m = 1;
		int n = 1;
		obj.merge(num1, m, num2, n);
		obj.swap(num1, m, num2, n);

	}
}
