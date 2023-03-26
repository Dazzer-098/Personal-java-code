package binary;

public class binarysearch{
    
    public static int BINARY(int[] number ,int element) {
        int start=0;
        int end= number.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(number[mid]==element){
                return mid;
            }else if(element>mid){
                start=mid+1;
            }
            else if(element<mid){
                end=mid-1;
            }
            
        }
        return -1;        
    }

    public static void main(String[] args) {
        int[] arr={2,4,6,8,25,56};
        int index=BINARY(arr,25);
        System.out.println(index);
    }

}
