class CountDigits {
    static int countDigits(int n) {
        int result = 0;
        int i = n;
        while (i > 0) {
            i = i / 10;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(12458));
    }
}