package Arraycode;
public class arr {
    public static int increment(int Arr[]) {
        // Arr= new int[5];//again new memory address is provided. Arr hold diffrent memory location than a1,
        // because we are creating new array
        int j=0;
        for(int i=0;i<Arr.length;i++){
            j=Arr[i]+1;
        }
        return j;
    } 
    // public static void print(int a[]) {
    //     for(int i=0;i < a.length;i++){
    //         System.out.print(a[i]+" ");
    //     }   
    //     System.out.println();     
    // }   
    public static void main(String[] args) {
        int a1[]=new int[5];// suppose memory address is 250. so a1 hold only memory location not value
        
        System.out.println(increment(a1));
        // print(a1);

    }
}
