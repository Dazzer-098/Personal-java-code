public class largest_row_col {

    public static void main(String[] args) {
        int arr[][]={{1,2},{90,100},{3,40},{10,200}};
        int max,max_value,k=0,sum1=0,sum2=0;
        int max_index=0;
        max=Integer.MIN_VALUE;
        max_value=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        sum1=0;
            for(int j=0;j<arr[0].length;j++){
                sum1=sum1+arr[i][j];
            }
            
            
            if(k<arr[0].length){
                sum2=0;
                for(int j=0;j<arr.length;j++){
                    sum2=sum2+arr[j][k];
                    
                }
                k++;
            }
            if(sum1>sum2){
                max=sum1;
                max_index=i;
            }
            if(sum2>sum1){
                max=sum2;
                max_index=k-1;
            }
            System.out.println(max_index);
            if(max>max_value){
                max_value=max;
        
            }
            
            
            
            
       }
       System.out.println(max_value+" "+max_index);
       
    }
    
}
