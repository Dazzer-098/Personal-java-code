package recursion_Q;

public class fabonacciR {
    public static int fab(int n) {
        if(n==1||n==2){
            return n-1;
        }
        else{
            return fab(n-1)+fab(n-2);
        }
        
        
    }
    public static void fab_series(int n) {
        for (int i = 1; i <=n ; i++) {
            System.out.print(fab(i)+" ");
            
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int n=5;
        
        fab_series(n);
        System.out.println(fab(n));
        
    }
    
}
