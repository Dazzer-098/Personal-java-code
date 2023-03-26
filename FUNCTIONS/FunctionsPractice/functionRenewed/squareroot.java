package functionRenewed;
import java.util.Scanner;

public class squareroot {
    public static int root(int number){
        int i=1;
        int power=0;
        int j=i;
        while(number>0){
            number=number-j;
            if(number<0){
                break;
            }else{
                power++;
            }
            i++;
            j=2*i-1;
        }
        return power;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Number= sc.nextInt();
        int power=root(Number);
        System.out.println(power);
    }
}
