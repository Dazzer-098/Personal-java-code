package functionRenewed;

import java.util.Scanner;

public class powerOf_number {
    public static int  POWER(int number, int power ) {
        int product=1;
        for(int i=1;i<=power;i++){
            product=number*number;
        }
        return product;
        
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int power= sc.nextInt();
        System.out.println(POWER(number,power));
        
    }
    
}
