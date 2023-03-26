package functionRenewed;


import java.util.Scanner;

public class Function1{

    public static int Factorial(int n){
        int num= 1;
        for(int i=1;i<=n;i++){
            num=num*i;
        }
        return num;
    }
    public static int NcR(int n, int r) {
        int num= Factorial(n);
        int d1= Factorial(r);
        int d2= Factorial(n-r);

        int ans= num/(d1*d2);
        return ans;
        
    }
    public static void main(String[] args) {
        String s= "1 2";
        Scanner sc= new Scanner(s);
        int i= sc.nextInt();
        int r= sc.nextInt();
        System.out.println(NcR(i, r));
        
    }
}