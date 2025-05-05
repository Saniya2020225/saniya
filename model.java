public class model {
    void shape(int a){
        System.out.println("area of square"+a*a);
    }
    void shape(int a,int b){
        System.out.println("area of rectangle"+a*b);
    }
    public static void main(String[] args) {
        model obj=new model();
        obj.shape(5);
        obj.shape(5,2);
    }
}
