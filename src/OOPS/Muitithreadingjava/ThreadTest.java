package OOPS.Muitithreadingjava;

public class ThreadTest extends Thread{
    String name;
    ThreadTest(String name){
        this.name =name;
    }
    @Override
    public void run() {
        //System.out.println("We are in new thread called test");
        for(int i=0;i<100;i++){
            System.out.println("We are in new thread called test"+ name);
        }
    }
}
