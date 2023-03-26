package Sort;

public class bubbleSort {
    public static void bubble(int arr[]) {
        int count =0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=0;
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    count=count+1;/* total no of swaping */
                }
                
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]={10,9,8,7,6,5,4,3,2,1,0};
        bubble(arr);
    }    
}
