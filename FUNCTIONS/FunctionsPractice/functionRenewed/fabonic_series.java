package functionRenewed;

public class fabonic_series {

    public static void fabonic(int size) {
        int f1=0,f2=1,f3;
        System.out.print(f1+" ");
        System.out.print(f2+" ");
        for(int i=1;i<=size-2;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.print(f3+"  ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int size=6;
        fabonic(size);

    }
    
}
