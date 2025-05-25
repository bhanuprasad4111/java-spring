package Inheritance;

public class B extends A {
    B(){
        System.out.println("In constructor B");
    }
    B(int a){
        super(a);
        System.out.println("In parameter constructor"+a);
    }
    void bhanu(int a){
        System.out.println("The number is B "+a);
    }
    public static void main(String[] args) {
        A a=new B(10);
        a.bhanu(10);
    }
}
