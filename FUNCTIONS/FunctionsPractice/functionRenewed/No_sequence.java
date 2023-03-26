package functionRenewed;

import java.util.Scanner;

public class No_sequence {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 9 10String s= sc.next();
        // sc.useDelimiter("");
        int a= Integer.MIN_VALUE;
        int count=0;
        boolean iSsequence= true;
        int i=0;
        while(sc.hasNextInt()){
            int value= sc.nextInt();
            if(count>0){
                if(value>a){
                    iSsequence=false;
                    return ;
                }
            }
            else if(value>a){
                a=value;
            }else if(value<a){
                a=value;
                count++;
            }
            i++;
        }
        System.out.println(iSsequence);
    }
    
}
