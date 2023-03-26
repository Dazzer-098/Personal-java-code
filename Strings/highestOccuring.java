public class highestOccuring {

    public static void main(String[] args) {
        String s="xy";
        char[] str=s.toCharArray();
        int size=str.length;
        int max=Integer.MIN_VALUE;
        int max_index=0;
        int count;
        for(int i=0;i<size;i++){
            count=0;
            for(int j=i;j<size;j++){
                if(str[i]==str[j]){
                    count+=1;
                }
            }
            if(count>max){
                max=count;
                max_index=i;
            }
        }
        System.out.println(str[max_index]+" "+max);
    }
    
}
