package functionRenewed;


import java.util.Scanner;

public class BinaryToDecimal {

    

    public static void DecimalToBinary(int number) {
        int decimal=0;
        String binary= "";
        
        while(number>0){
            decimal=number%2;
            binary=binary+Integer.toString(decimal);
            number=number/2;
        }
        String binary1="";
        for(int i=binary.length()-1;i>=0;i--){
            char String1=binary.charAt(i);
            binary1=binary1+String.valueOf(String1);
        }
        
         System.out.println(binary1);
    }
    public static int power(int N ,int i) {
        int product=1;
        if(i==0){
            product=1;
        }else{
            for(int j=1;j<=i;j++ ){
                product=product*N;
            }
        }
        return product;
        
        
    }
    public static int Decimal(int input) {
        int i=0;
        int sum=0;
        while(input>0){
            sum=sum+(input%10)*(power(2, i));
            input=input/10;
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int binary= sc.nextInt();
        int number1= sc.nextInt();
        System.out.println(Decimal(binary));
        DecimalToBinary(number1);
    }
    
}
