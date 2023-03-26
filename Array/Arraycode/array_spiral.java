package Arraycode;

public class array_spiral {

//     public static void main(String[] args) {
//         int arr[][] = new int[2][3];
//         int row=0;
//         int col= 0;
//         int size1=arr.length-1;
//         int size2=arr[0].length;
//         int boundary=size2-1;
//         char c='r';
//         for(int i=1;i<=arr.length*arr[0].length;i++){
//             arr[row][col]=i;

//             switch(c){
//                 case 'r':
//                 col+=1;
//                 break;
//                 case 'd':
//                 row+=1;
//                 break;
//                 case 'l':
//                 col-=1;
//                 case 'u':
//                 row-=1;
//                 break;
//             }
//             if(boundary==i){
//                 switch(c){
//                     case 'r':
//                     c='d';
//                     break;
//                     case 'd':
//                     c='l';
//                     break;
//                     case 'l':
//                     c='u';
//                     break;
//                     case 'u':
//                     c='r';
//                     break;
//                 }
//                 if(c=='d'||c=='u'){
//                     boundary=boundary+size1;
//                     size1=size1-1;
//                 }else{
//                     boundary=boundary+size2;
//                     size2=size2-1;
//                 }
//             }

//         }
//         for(int k=0;k<size1;k++){
//             for(int j=0;j<size2;j++){
//                 System.out.print(arr[k][j]);
//             }
//         }
//         System.out.println();
//     }
    
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4,5},{14,15,16,17,6},{13,20,19,18,7},{12,11,10,9,8},{21,22,23,24,25}};
        int fr,lr,fc,lc;
        fr=0;
        fc=0;
        lr=arr.length;
        lc=arr[0].length;
        while(fr<lr && fc<lc){
            for(int i=fc;i<lc;i++){
                System.out.print(arr[fr][i]+" ");
            }
            fr++;
            for(int i=fr;i<lr;i++){
                System.out.print(arr[i][lc-1]+" ");
            }
            lc--;
            if(fr<lr){
                for(int i=lc-1;i>=fc;i--){
                    System.out.print(arr[lr-1][i]+" ");
                }
                lr--;
            }
            if(fc<lc){
                for(int i=lr-1;i>=fr;i--){
                    System.out.print(arr[i][fc]+" ");
                }
                fc++;
            }
            
        }
    }
}
