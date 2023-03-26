package pattern;

import java.util.Scanner;

public class mirrorNoPattern {

    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     int value= sc.nextInt();
    //     int k=(value*2-1);
    //     int i=1;
    //     int x=0;
    //     while(i<=value){
    //         int j=1;
    //         while(j<=(k-(i+x))){
    //             System.out.print(" ");
    //             j++;
    //         }
    //         int print_control=i;
    //         int y=1;
    //         while(y<=i){
    //             System.out.print(print_control);
    //             print_control++;
    //             y++;

    //         }
    //         int print_control2= print_control-2;
    //         int m=1;
    //         while(m<=k-(k-x)){
    //             System.out.print(print_control2);
    //             print_control2--;
    //             m++;
    //         }
    //         x++;
    //         i++;
    //         System.out.println();
    //     }

    //}
    public static void main(String args[])
    {
          
        int n = 5, i, j, num = 1, gap;
  
        gap = n - 1;
  
        for ( j = 1 ; j <= n ; j++ )
        {
        num = j;
          
        for ( i = 1 ; i <= gap ; i++ )
            System.out.print(" ");
          
        gap --;
          
        for ( i = 1 ; i <= j ; i++ )
        {
            System.out.print(num);
            num++;
        }
        num--;
        num--;
        for ( i = 1 ; i < j ; i++)
        {
            System.out.print(num);
            num--;
        }
        System.out.println();
        }
    }

    
    
}
