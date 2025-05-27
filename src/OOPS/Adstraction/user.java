package OOPS.Adstraction;

public interface user {
    public static final int a=10;
    void bhanu();
    void somu();
    public default void ramu(){
        System.out.println("i am in ramu");
    }
}
