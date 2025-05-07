class Red{
    void sum(int a){
        System.out.println(a);
    }
    void sum(int a, int b){
        System.out.println(a+b);
    }
}

public class Color {
    public static void main(String[] args) {
        
    
    Red obj=new Red();
    obj.sum(5);
    obj.sum(5,6);
    }
}

