public class comparearray {
    public static void main(String[]args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};
        //boolean isEqual = java.util.Arrays.equals(arr1 , arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==arr2[i]){
                System.out.println("array equal");
            }
            else{
                System.out.println("not equal");
            }
        }
        //if(isEqual){
           // System.out.println("Arrays are equal");
       // }
       // else{
          //  System.out.println("Array are not equal");
       // }
    }
}
