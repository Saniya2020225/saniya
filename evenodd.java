import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int even = 0 , odd = 0;
        System.out.print("enter elements");
        for(int i=0 ; i< n ; i++)
        {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
            even++;
            else
            odd++;
        }
        System.out.print("even: " + even + ", odd: " + odd);

    }
    
}
