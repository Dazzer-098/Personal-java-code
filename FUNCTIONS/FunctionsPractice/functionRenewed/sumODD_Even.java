package functionRenewed;

import java.util.Scanner;

public class sumODD_Even {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    
        sc.useDelimiter(" ");
        int odd_sum=0;
        int even_sum=0;
        while(sc.hasNextInt()){
            // int value= sc.hasNextInt();
            int value= sc.nextInt();
            if(value%2==0){
                even_sum += value;
            }
            else{
                odd_sum +=value;
            }
        }
        System.out.print(even_sum);
        System.out.println(odd_sum);
    }
    
}
