public class Saniya {
    int age;
    Saniya(int age){
        this.age=age;
    }
    void print(){
        System.out.println(age);
    }
    public static void main(String[] args) {
    Saniya obj=new Saniya(18);
    obj.print();
}
}