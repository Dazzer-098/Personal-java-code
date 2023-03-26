package functionRenewed;


import java.util.Scanner;

public class APseries {
    public static void series(int N){
        int count=1;
        int i=1;
        while(count<=10){
            int result=3*i+2;
            if(result%4!=0){
                count++;
                System.out.print(result+" ");
            }
            i++;
        }
            
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        series(N);
    }
    
}
