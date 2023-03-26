package functionRenewed;

import java.util.Scanner;

public class facbonic_member {
    
    public static boolean member(int number) {
        int f1=0,f2=1,f3=0;
        boolean IsMember=false;
        while(f3<=number){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            if(f3==number){
                IsMember=true;
            }
        }
        return IsMember;
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        if(member(number)==true){
            System.out.println(number+" is fabonacci_member");
        }
        else{
            System.out.println(number+" is not fabonacci_member");
        }
    }
}
