abstract class Payment{
abstract void pay(int a);
void success(){
    System.out.println("payment done");
}
}
class UPIpayment extends Payment{
    void pay(int a){
System.out.println("pay via upi"+a);
    }
}
class Netbanking extends Payment{
    void pay(int b){
        System.out.println("pay via netbanking"+b);
    }
}
public class Bank {
    public static void main(String[] args) {
    Payment obj=new UPIpayment();
    obj.pay(15000);
    obj.success();
    Payment obj1=new Netbanking();
    obj1.pay(16000);
    obj1.success();
    }
}
