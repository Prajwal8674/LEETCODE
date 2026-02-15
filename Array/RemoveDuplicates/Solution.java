    package Array.RemoveDuplicates;

    public class Solution {
        public static int removeDuplicate(int[] nums) {
            if (nums.length == 0) return 0;

            int i = 0;
            int j = 1;

            while (j < nums.length) {
                if (nums[i] != nums[j]) {
                    i++;
                    nums[i] = nums[j];
                }
                j++;
            }

            return i + 1;
        }
        public static void main(String[] args) {
            int[] nums = {1, 1, 2};

            int newLength = removeDuplicate(nums);

            System.out.println("New length: " + newLength);
            System.out.print("Unique elements: ");
            int k = 0;
            while (k < newLength) {
                System.out.print(nums[k] + " ");
                k++;
            }
        }
    }
