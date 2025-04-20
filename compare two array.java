public class compare two array {
    public static void main(String[]args){
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        boolean isEqual = java.util.Arrays.equals(arr1 , arr2);
        if(isEqual){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Array are not equal");
        }
    }
}
