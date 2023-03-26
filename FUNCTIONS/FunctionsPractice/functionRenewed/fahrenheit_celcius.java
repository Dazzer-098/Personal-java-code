package functionRenewed;

import java.util.Scanner;

public class fahrenheit_celcius {
    public static void celcius(int start,int end,int step) {
        int celcius=0;
        for(int i=start;i<=end;i=i+step){
            celcius=((i-32)*5)/9;
            System.out.println(celcius);
        }
        

        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int step=sc.nextInt();
        celcius(start, end, step);;
    }

    
}
