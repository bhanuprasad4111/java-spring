package OOPS.Polym;

public class Student {
    int bhanu (int a){
        return a;
    }
    int bhanu(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        Student s=new Student();
        int a=10,b=10;
        String bha="bhanu",ba="bhanu";
        System.out.println(a+" "+b);
        System.out.println(s.bhanu(10,20));
    }
}
