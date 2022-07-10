class Insertion2array:
    def intersect(self, nums1, nums2):

        nums1.sort()
        nums2.sort()

        p1 = p2 = 0
        result = []

        while p1 < len(nums1) and p2 < len(nums2):
            num1 = nums1[p1]
            num2 = nums2[p2]

            if num1 < num2:
                p1 += 1
            elif num1 > num2:
                p2 += 1
            else:
                result.append(num1)
                p1 += 1
                p2 += 1

        return result