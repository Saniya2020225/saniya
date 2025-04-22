public class string4 {
    public static void main(String[] args) {
        String str="eye";
String rev="";
for(int i=0;i<str.length()-1;i++){
rev+=str.charAt(i);
}
System.out.println(rev);
if(str.equals(rev)){
    System.out.println("palindrom");
}
else{
    System.out.println("not");
}
    }
}
