public class sorting {
   public static void bubblesort(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i:arr){
        System.out.println(i);
        }
    }


public static void main(String[] args){
    int[] arr={2,5,7,9,3,4,1,6,8};
   bubblesort(arr);
   
}
}
