package Arraycode;

public class array_two2d {
    
    public static void main(String[] args) {
        int arr[][]={{9,3},{5,4},{1,5}};
        int row= arr.length;
        int cols= arr[0].length;
        int max= Integer.MIN_VALUE;
        int sum;
        // for(int i=0;i<cols;i++){
        //     sum=0;
        //     for(int j=0;j<row;j++){
        //         sum=sum+arr[j][i];
        //     }
        //     if(sum>max){
        //         max=sum;
        //     }
        // }
        for(int i=0;i<cols;i++){
            if(i%2!=0){
                for(int j=row-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
            else{
                for(int j=0;j<row;j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
        System.out.println();
        // System.out.println(max);


        System.out.println(arr[0].length); //length of 1-d array which present at index zero of master array
    }
}
