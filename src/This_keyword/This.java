package This_keyword;


public class This {
    int age;
    String name;


    //....................Before useing the THIS key word.................
//    This( int x,String y){
//        age=x;
//        name=y;
//        System.out.println("my name is "+x+"age "+y);
//    }

    //....................After useing the THIS key word.................
    This( int age, String name){
        this.age=age;
        this.name=name;
        System.out.println("my name is "+name+"age "+age);
    }
    public static void main(String[] args) {
        This obj=new This( 20,"imal");
    }
}
