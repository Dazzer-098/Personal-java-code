import java.util.*;
public class LargestOfThreeNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a>=b && a>=c){
            System.out.println("a=Greater");
        }else if(b>=c){
            System.out.println("b=Greater");
        }else{
            System.out.println("c=Greater");
        }

    }
}
