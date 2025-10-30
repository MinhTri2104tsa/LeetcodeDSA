package DSA;

public class ReverseInteger {
    public int reverse(int x) {
        long sum = 0;
        while(x!=0){
            int rem = x%10;
            sum += rem;
            sum = sum*10;
            x= x/10;
        }
        sum = sum/10;
        if(sum > Integer.MAX_VALUE || sum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*sum);
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        ReverseInteger rv = new ReverseInteger();
        System.out.println(rv.reverse(123));
        System.out.println(rv.reverse(-123));
        System.out.println(rv.reverse(120));
    }
}
