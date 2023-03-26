package pattern;

import java.util.Scanner;

public class AlphabetPattern {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n/2){
                if(j<n/2 && i==1||i==n/2 &&j<=n/2||i>1 &&(j==1||j==n/2)){
                    System.out.print("*");
                    j++;
                }else{
                    System.out.print(" ");
                    j++;
                }
            }
            i++;
            System.out.println();
        }
    }
}
