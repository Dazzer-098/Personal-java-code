package pattern;
import java.util.*;

public class patternInteresting {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i,j; 
        int N= sc.nextInt();
        char c= (char)('A'+N-1);
        i=1;
        while(i<=N){
            j=1;
            while(j<=i){
                System.out.print(c);
                c++;
                j++;
                
            }
            c=(char)(c-1);
            c=(char)(c-i);
            i++;
            System.out.println();
        }
        
    }
    
}
