import java.util.Arrays;

public class RotateArray {
    static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (nums.length == 1)
            return;

        int[] ans = new int[nums.length];
        int count = 0;
        for (int i = nums.length - k; i < nums.length; i++)
            ans[count++] = nums[i];

        for (int i = 0; i < nums.length - k; i++)
            ans[count++] = nums[i];

        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
    }
}
