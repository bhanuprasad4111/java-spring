package OOPS.Super;

public class B extends A {
    int p;
    int q;
    B(){
        //super();
    }
    B(int p,int q){
        this.p=p;
        this.q=q;
    }
    B(B a){
       this.p=a.p;
       this.q=a.q;
    }
    static void play(){
        System.out.println("Inside B's play");
    }

    public static void main(String[] args) {
        System.out.println(B.run());
        B a=new B(10,20);
        B c=new B(a);
        System.out.println(c.p+" "+c.q);
        a.bhanu().somu();
        A x=new B();
        x.play();
        B.play();

    }
}
