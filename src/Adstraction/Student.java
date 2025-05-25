package Adstraction;

public class Student implements user{

    @Override
    public void bhanu() {



        System.out.println("I am in bhanu student");
    }

    @Override
    public void somu() {
        System.out.println("I am in somu Student");
    }

    public static void main(String[] args) {
        user s=new Student();
        s.bhanu();
        s.somu();
        s.ramu();
    }
}
