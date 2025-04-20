import java.util.Scanner;
public class foundarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter number to search");
        int x = sc.nextInt();
        boolean found = false;
        for(int val : arr){
            if(val == x){
                found = true;
                break;
            }
        }
        if(found)
        System.out.print(x + "is present in the array");
        else
        System.out.print(x + "is not present in the array");
    }
}
