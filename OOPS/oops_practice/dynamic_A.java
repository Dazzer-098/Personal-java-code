package oops_practice;

public class dynamic_A {
    private int data[];
    private int index=0;
    private int size;


    dynamic_A(){
        data= new int[5];
        
        
    }

    public int GetSize(){
        return data.length;
    }

    public int Getdata(int index){
        
        return data[index];

        
    }
    public void SetData(int index ,int value){
        data[index]=value;
    }

    public int Getindex(){
        return index;
    }

    public void add(int element){
        if(index==data.length){
            restructure();

        }
        
        data[index]=element;
        index++;
        
    }

    public void setNumber(int index, int element){
        if(index>this.index){
            return;
        }else if(index<this.index){
            data[index]=element;
        }else{
            add(element);
        }
    }

    private void restructure(){
        int temp[]=data;
        data=new int[data.length*2];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }
    void restructure(int size){
        int temp[]=data;
        data =new int[size];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }


    public void print(){
        if(index==0){
            return ;
        }
        else{
            for(int i=0;i<index;i++){
                System.out.print(data[i]+" ");
            }
        }
    }
    
}
