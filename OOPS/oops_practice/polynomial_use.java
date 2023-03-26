package oops_practice;

public class polynomial_use {

    public static void main(String[] args) {
        
        polynomial p=new polynomial();

        p.SetCofficent(0, 3);
        p.SetCofficent(1, 5);
        p.SetCofficent(2, 8);
        p.SetCofficent(3, 9);
        p.SetCofficent(1, 8);
        p.SetCofficent(8, 100);

        polynomial p1= new polynomial();
        p1.SetCofficent(0, 3);
        // p.print();
        // p1.print();
        p.add(p1);
        p.print();

        p.Evaluate(1);


        
    }
}
