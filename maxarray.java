public class maxarray {
    public static void main(String[] args) {
        int [][] arr={ {1,2,3,4},{3,5,7,4},{2,10,6,8} };
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                while(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.print(max);
    }
}
