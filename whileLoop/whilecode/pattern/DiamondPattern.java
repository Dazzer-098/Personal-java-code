package pattern;

import java.util.Scanner;

public class DiamondPattern {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        int j;
        int print_control=1;
        while(i<=n){
            j=1;
            while(j<=(n-print_control)){
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=(2*print_control-1)){
                System.out.print("*");
                k++;
            }
            if(i<=n/2){
                i++;
                print_control++;
            }else{
                i++;
                print_control--;
            }
            System.out.println();
        }
    }
}
