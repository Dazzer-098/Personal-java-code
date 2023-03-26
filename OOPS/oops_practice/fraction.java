package oops_practice;

public class fraction {
    private int numerator;

    private int denomenator;

    fraction( int numerator, int denomenator){
        this.numerator=numerator;
        this.denomenator=denomenator;
        simplify();

    }

    public void setnumerator(int numerator){
        this.numerator= numerator;
        simplify();
    }
    public int GetNumerator() {
        return numerator;
        
    }

    public void Setdenomenator(int denomenator){
        this.denomenator= denomenator;
        simplify();
    }
    public int GetDenomenator() {
        return denomenator;
        
    }

    public void add(fraction f){
        numerator= (numerator*f.denomenator)+(f.numerator*denomenator);
        denomenator=denomenator*f.denomenator;
        simplify();
    }

    public static fraction add(fraction f1, fraction f2){
        int n1= (f1.numerator*f2.denomenator)+(f1.denomenator*f2.numerator);
        int n2= f1.denomenator*f2.denomenator;
        fraction f3= new fraction(n1, n2);
        
        return f3;
    }

    public void multiply(fraction f){
        numerator=numerator*f.numerator;
        denomenator=denomenator*f.denomenator;
        simplify();
    }


    public void simplify(){
        int gcd=1;
        int smaller= Math.min(numerator, denomenator);
        for(int i=2;i<=smaller;i++){
            if(numerator%i==0 && denomenator%i==0 ){
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denomenator=denomenator/gcd;
    }
    public void print(){
        if(denomenator==1){
            System.out.println(numerator);
        }else{
            System.out.println(numerator+"/"+denomenator);
        }
        
    }
    
}
