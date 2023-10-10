public class ReverseNumber {
        static int reverse(int x) {
            int res = 0;
            int i = 0;
            if(x < 0)
            i = -1 * x;
            else
            i = x;
    
            while(i > 0){
                int h = i % 10;
                res = res * 10 + h;
                i = i / 10;
            }
    
            if(x < 0)
            return -1 * res;
            else
            return res;
        }
    public static void main(String[] args) {
        System.out.println(reverse(-12345));
    }
}
