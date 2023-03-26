// get geometric sum 1+1/2+1/4+1/6+1/8....1/2^k
package recursion_Q;

public class geometric_R {
    public static double name(int k) {
        if(k==0){
            return 1;
        }
        return 1/Math.pow(2, k)+name(k-1);

        
    }
    public static void main(String[] args) {
        System.out.println(name(3));
    }
}
