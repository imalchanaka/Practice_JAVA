package Data_Encapsulation;


public class Student {
    private  String Name;
    private  int age;

    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }

    public  void setAge(int age){
        this.age=age;

    }
    public int getAge(){
        return age;
    }
}
