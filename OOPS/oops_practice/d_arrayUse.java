package oops_practice;

public class d_arrayUse {

    public static void main(String[] args) {
        dynamic_A d= new dynamic_A();

        // for(int i=0;i<=5;i++){
        //     d.add(i);
        // }
        // System.out.println(d.Getindex()); 
        d.add(10);
        d.add(13);
        // d.add(10);
        // d.add(10);
        // d.add(10);
        // d.add(10);
        // d.setNumber(6, 19);
        // d.setNumber(10, 20);
        System.out.println(d.Getdata(1));
        d.print();
    }
    
}
