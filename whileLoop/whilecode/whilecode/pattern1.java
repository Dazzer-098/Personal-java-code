package whilecode;

import javax.xml.validation.Validator;

public class pattern1{
    public static void main(String[] args) {
        int i=1;
        int value=10;
        int val=1;
        while(i<=value){
            int j=1;
            while(j<=i){
                System.out.print(val);
                val=val+1;
                j=j+1;
                if(i==value && j==value){//this line of code is used for making last digit of pattern equal to first digit
                    val=1;
                }

            }
            i=i+1;
            System.out.println();
        }
        
    }
}