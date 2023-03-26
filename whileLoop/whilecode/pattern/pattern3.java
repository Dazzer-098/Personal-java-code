package pattern;

public class pattern3 {
    public static void main(String[] args) {
        int N=4;
        int value=1;
        int i=1;
        while(i<=N){
            int j=0;
            while(j<i){
                System.out.print(value);
                value=value+1;
                j++;
            }
            i++;
            System.out.println();
        }
    }
    
}
