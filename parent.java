public class parent {
    void sum (int a){
        System.out.println("in class");
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void sum(int a,int b,int c,int d){
        System.out.println("busy");
    }

public static void main(String[] args){
parent obj=new parent();
obj.sum(420);
obj.sum(420,20);
obj.sum(420,20,40);
obj.sum(420,20,40,80);
}
}
