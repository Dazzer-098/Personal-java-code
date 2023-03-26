public class compress_string {

    public static void main(String[] args) {
        String s="aaabbccdsa";
        char str[]=s.toCharArray();
        int count;
        int j;
        for(int i=0;i<str.length;i++){
            count=0;
            for(j=i;j<str.length;j++){
                if(str[i]==str[j]){
                    count++;
                }else{
                    break;
                }
            }

            if(count>1){
                System.out.print(str[i]+""+count);
            }else{
                System.out.print(str[i]);
            }
            
            i=j-1;


        }
        System.out.println();
    }
    
}
