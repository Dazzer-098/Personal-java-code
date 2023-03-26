// count no of zeros present in number

package recursion_Q;

public class CountZero_R {
    public static int  countZ(int n) {
        if(n==0){
            return 0;
        }
        int count=0;
        int rem=n%10;
        n=n/10;
        if(rem==0){
            count++;
        }
        return count+countZ(n);
        
    }
    public static void main(String[] args) {
        int a=30760;
        System.out.println(countZ(a));
    }
    
}
