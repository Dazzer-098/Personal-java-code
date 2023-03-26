package recursion_Q;

public class countR {

    public static int count(int n) {
        if(n==0){
            return 0;
        }
        int length=1;
        
        n=n/10;
        
        return length+count(n);
    }
    public static int digit(int n){
        if(n==1){
            return 1;
        }
        return 1+digit(n-1);
    }
    public static void digit_series(int n) {
        for (int i = 1; i <=n; i++) {
            System.out.print(digit(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=-156;
        // System.out.println(count(n));
        int length=6;
        digit_series(length);
    }
}
