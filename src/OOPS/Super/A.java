package OOPS.Super;

public class A {
    int a;
    private static int b=100;
    A(){
        this(10);
        System.out.println("In default constructor");
    }
    A(int a){
        this.a=a;
        System.out.println("In parameter constuctor"+a);
    }
     A bhanu(){
         System.out.println("in bhanu");
         return this;
     }
     void somu(){
         System.out.println("in somu");
     }
     static int run(){
        return b;
     }

     static void play(){
         System.out.println("inside A's play");
     }
}
