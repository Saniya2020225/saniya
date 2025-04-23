public class string8 {
    public static void main(String[] args) {
        String str="leela";
        String newStr="";
       // String other="";
for(int i=0;i<str.length();i++){
    char c =str.charAt(i);
    if(newStr.indexOf(c)==-1){
        newStr+=c;
    }
    else{
       // other=other+c;
       System.out.print(str.charAt(i));
       break;
    }
}
//System.out.println(other);
}
}
