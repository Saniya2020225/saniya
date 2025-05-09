 class Atm {
    private int a;
    void setRupees(int a){
    this.a=a;
    }
    int getRupees(){
        return a;
    }
}
   public class Money{
     public static void main(String[] args) {
        Atm obj=new Atm();
        obj.setRupees(50000);
        obj.getRupees();
        System.out.println(obj.getRupees());
     }
    }