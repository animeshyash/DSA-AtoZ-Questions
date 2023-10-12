public class largestElement {
    static int largest(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largest(new int[] { 2, 5, 1, 3, 0 }));
        System.out.println(largest(new int[] { 8, 10, 5, 7, 9 }));
    }
}