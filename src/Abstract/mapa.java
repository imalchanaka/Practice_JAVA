package Abstract;

// when overwriting  the abstract methord we have to extend this file like 'public class mapa  extends Imal'
public class mapa  extends Imal{

    void run(){
        System.out.printf("i am runnig");// overwrite the Imal class run abstract methord
    }
    public static void main (String[]args){

        mapa obj=new mapa();
        obj.run();
    }
}
