package functionRenewed;

import java.util.Scanner;

public class totalSalary {

    public static int HRA(int basics) {
        // int hRa=1;
        int hRa=(20*basics)/100;
        return hRa;
        
    }
    public static int DA(int basics) {
        // int dA=1;
        int dA=(50*basics)/100;
        return dA;
        
    } public static int PF(int basics) {
        // int hRa=1;
        int PF=(11*basics)/100;
        return PF;
        
    }
    public static int ALLOWANCE(char grade) {
        int allow=1;
        if(grade=='A'){
            allow=1700;
            return allow;
        }
        else if(grade=='A'){
            allow=1500;
            return allow;
        }
        else{
            allow=1300;
            return allow;
        }
    }
    public static void salary( int basics, char grade) {
        int totalSalary= basics + HRA(basics) +DA(basics) + ALLOWANCE(grade)-PF(basics);
        System.out.println(totalSalary);
        
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int salary= sc.nextInt();
        String inputG= sc.next();
        char grade= inputG.charAt(0);
        salary(salary,grade);

    }
    
}
