package pattern;

import java.util.Scanner;

public class HollowPattern {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int value= n*2-1;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=value){
                if(i<=n&&(j==(n-i+1)||j==(n+i-1))){
                    System.out.print("*");
                    j++;
                }
                else{
                    System.out.print(" ");
                    j++;
                }

            }
            i++;
            System.out.println();
        }
    }
}
