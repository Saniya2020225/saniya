public class hii {
    public static void main(String[] args) {
        System.out.println("idher dekhooo");
        Thread t1= new Thread(()->{
System.out.println("hello");
        });
        Thread t2= new Thread(()->{
            System.out.println("hiiiii");
        });
        t1.start();
        t2.start();
    }
}