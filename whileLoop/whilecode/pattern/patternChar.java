package pattern;

public class patternChar {
    
    public static void main(String[] args) {
        int N=4;
        int i=1;
        while(i<=N){
            char c=(char)('A'+i-1);
            int j=0;
            while(j<N){
                System.out.print(c+" ");
                c=(char)(c+1);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
