class MyThread extends Thread{
    public void run(){
    for(int i=1;i<=10;i++){
        System.out.println(getName() + "is running with priority");
        Thread.yield();
    }
}
}
public class PriorityExampleWithoutSuper{
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.setName("Low Priority Thread");
        t2.setName("High Priority Thread");
        t1.setPriority(Thread.MIN_PRIORITY);//1
        t2.setPriority(Thread.MAX_PRIORITY);//10
        t1.start();
        t2.start();
    }
}