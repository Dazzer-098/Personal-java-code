package functionRenewed;

import java.util.Scanner;

public class sumORproduct {

    public static int Product(int number) {
        int multiple=1;
        for(int i=2;i<=number;i++){
            multiple*=i;
        }
        return multiple;
        
    }
    public static int Sum(int number) {
        int add=0;
        for(int i=1;i<=number;i++){
            add+=i;
        }
        return add;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int choice= sc.nextInt();
        if(choice==1){
            System.out.println(Sum(number));
        }else if(choice==2){
            System.out.println(Product(number));
        }else{
            System.out.println("-1");
        }
    }
    
}
