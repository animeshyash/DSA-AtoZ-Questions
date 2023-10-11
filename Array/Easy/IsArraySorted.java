public class IsArraySorted {
    static boolean check(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i])
                count++;

            if (count > 1)
                return false;
        }

        if (count > 0) {
            if (nums[0] < nums[nums.length - 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(check(new int[] { 1, 1, 1 }));
    }
}