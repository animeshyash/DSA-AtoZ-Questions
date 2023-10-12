public class SecondLargest {
    static int secondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                second = largest;
                largest = nums[i];
            } else if (nums[i] > second && nums[i] != largest)
                second = nums[i];
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[] { 1, 2, 4, 7, 7, 5 }));
        System.out.println(secondLargest(new int[] { 1 }));
    }
}
