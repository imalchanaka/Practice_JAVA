package polymorphism;

public class Methord_Overloading {

    public void meth(){
        System.out.println("methord 1");
    }
    //Methord overloading
    public void meth(int x){

        System.out.println("my age is "+x);

    }
    public void meth(int x,int y){

        int z=x+y;
        System.out.println(z);

    }

    public static void main(String [] args){

        Methord_Overloading obj=new Methord_Overloading();
       // obj.meth();
        obj.meth(22);
        obj.meth(20,50);

    }
}
