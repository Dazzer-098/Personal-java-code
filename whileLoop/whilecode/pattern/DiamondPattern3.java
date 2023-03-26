import java.util.Scanner;

public class DiamondPattern3 {

    public static void Diamond(int rows) {
        int i=1;
        int k=1;
        while(i<=rows){
            int j=1;
            while(j<=(rows-2-k)){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=(2*k-1)){
                System.out.print("*");
                j++;
            }
            if(i<=(rows)/2){
                i++;
                k++;
            }else{
                k--;
                i++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        Diamond(rows);    
    }
    
}
