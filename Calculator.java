class Sum{
   void operation(int a,int b){
   System.out.println("sum is:"+a+b);
   }
}
class Subtract{
    void operation(int c,int d){
        System.out.println("subtract is:"+(c-d));
    }
}
class Multiplying{
    void operation(int f,int g){
        System.out.println("multiplying is:"+f*g);
    }
}
class Divide{
    void operation(int h,int i){
        System.out.println("divide is:"+h/i);
    }
}
public class Calculator {
    public static void main(String[] args) {
        Sum obj=new Sum();
        obj.operation(5, 06);
        Subtract obj1=new Subtract();
        obj1.operation(4, 02);
        Multiplying obj2=new Multiplying();
        obj2.operation(6, 3);
        Divide obj3=new Divide();
        obj3.operation(9, 3);
    }
}
