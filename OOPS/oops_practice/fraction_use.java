package oops_practice;

public class fraction_use {

    public static void main(String[] args) {
        fraction f1= new fraction(7, 5);

        fraction f2= new fraction(10,5);
        
        fraction f3= fraction.add(f1, f2);

        f3.setnumerator(8);
        f3.simplify();
        f3.print();
    }
    
}
