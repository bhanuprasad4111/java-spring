package OOPS.Muitithreadingjava;

public class ThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        Thread s1=new Thread(new ThreadTest("bhanu"));
        Thread s2=new Thread(new ThreadTest("naveen"));
        s1.setPriority(10);
        s2.setPriority(1);
        System.out.println("Thread count"+Thread.activeCount());

        s1.start();
        s2.start();
        for(int i=0;i<100;i++){
            System.out.println("We are in Main thread");
        }


    }
}
