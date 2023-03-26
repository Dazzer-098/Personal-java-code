import java.util.*;
public class HackerRankC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int TolOfChar= 15;
                System.out.print(s1);
                for(int j=1;j<=(15-s1.length());j++){
                    System.out.print("1");
                }
                String sc1=Integer.toString(x);
                if(sc1.length()<3){
                    for(int m=0;m<(4-sc1.length());m++){
                        sc1="0"+sc1;
                    }
                    System.out.print(sc1);
                }else{
                    System.out.println(sc1);
                }

            }
            System.out.println("================================");

    }
    
}
