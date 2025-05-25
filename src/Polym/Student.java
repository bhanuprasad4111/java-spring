package Polym;

public class Student {
    int bhanu (int a){
        return a;
    }
    int bhanu(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.bhanu(10,20));
    }
}
