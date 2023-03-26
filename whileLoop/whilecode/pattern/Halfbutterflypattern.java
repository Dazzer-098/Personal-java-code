package pattern;

import java.util.Scanner;

public class Halfbutterflypattern {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        int i=1;
        int print_control=1;
        while(i<=rows){
            int j=1;
            while(j<=rows){
                if(j<=print_control || j>=(rows-print_control+1)){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
                j++;
            }
            if(i<=(rows/2)){
                print_control++;
                i++;
                System.out.println();
            }else{
                print_control--;
                i++;
                System.out.println();
            }
        }
    }
}
