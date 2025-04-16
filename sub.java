public class sub {
    public static void main(String[] args) {
        int a=123;
        int sub=0;
        a=a/10;
        while(a>0){
            sub=sub-a%10;
            a=a/10;
        }
        System.out.println(sub);
    }
    
}
