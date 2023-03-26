package oops_practice;

public class polynomial {
    private dynamic_A d;
    private int cofficient;
    private int power;
    private String p;
    // private int index;

    polynomial(){
        cofficient=0;
        power=0;
        
        d=new dynamic_A();
    
    }
    int GetCofficent(int index){
        int value;
        if(index>=d.GetSize()){
            value=0;
        }
        else{
            value=d.Getdata(index);
        }
       
        return value;
        
    }

    public void SetCofficent(int power, int cofficient){
        if(power>=d.GetSize()){
            d.restructure(power+1);
        }
            
        d.SetData(power,cofficient);
    }
    long Power(int number ,int power){
        long product=1;
        for(int i=1;i<=power;i++){
            product=product*number;
        }
        return product;
    }

    void Evaluate(int number){
        long sum=0;
        

        

        
        for(int i=0;i<d.GetSize();i++){
            cofficient=d.Getdata(i);
            power=i;
            
            if(cofficient!=0){
                sum=sum+(cofficient*Power(number,power));
                
            }
            

        }
        System.out.println(sum);
        
    }

    void add(polynomial p){
        int Max_index=0;
        if(this.d.GetSize()<=p.d.GetSize()){
            Max_index=p.d.GetSize();
        }else{
            Max_index=this.d.GetSize();
        }
        for(int i=0;i<Max_index;i++){
          cofficient=this.GetCofficent(i)+p.GetCofficent(i);
          this.d.SetData(i, cofficient);  
        }
        System.out.println(Max_index);

    }

    void print(){
        String p="";
        System.out.println(d.GetSize());
        for(int i=0;i<d.GetSize();i++){
            cofficient=d.Getdata(i);
            power=i;
            
            if(cofficient!=0){
                p=(cofficient+"x"+"^"+power+"+");
                System.out.print(p);
            }
            

        }
        System.out.println();
    }

    

   
    
}
