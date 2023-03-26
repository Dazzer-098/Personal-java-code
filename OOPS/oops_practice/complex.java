package oops_practice;

public class complex {
    private int real;
    private int imaginary;

    complex(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;

    }

    public void add(complex c){
        real= real+c.real;
        imaginary= imaginary+ c.imaginary;
    }

    public static complex add(complex c1, complex c2){
        int r1= c1.real+c2.real;
        int r2= c1.imaginary+ c2.imaginary;
        complex c3= new complex(r1, r2);
        return c3;
    }

    public void conjugate(){
        System.out.println(real+" - "+imaginary+"i");
    }

    public void print(){
        System.out.println(real+" + "+imaginary+"i");
    }
}
