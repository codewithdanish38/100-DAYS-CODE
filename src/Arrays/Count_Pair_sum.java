package Arrays;

public class Count_Pair_sum {
    public static int Count(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
       int arr[]={1,5,7,2,-1,5};
       int Target=6;
        System.out.println(Count(arr,Target));
    }
}
