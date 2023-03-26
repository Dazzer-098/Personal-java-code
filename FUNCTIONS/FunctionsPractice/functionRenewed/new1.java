package functionRenewed;

import java.util.Scanner;

public class new1 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        
        while(sc.hasNext(s)){
            if(sc.hasNextInt()){
                System.out.println(sc.nextInt());
            }else{
                System.out.println(sc.next());
            }
            
        }
        sc.close();
        
    }
    
    
}
