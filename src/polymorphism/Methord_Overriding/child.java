package polymorphism.Methord_Overriding;

public class child extends Parent {

    public void call(){


        System.out.println("now i have a phone");
    }

    public static void main(String []args){
        child obj=new child();
        obj.call();



    }



}
