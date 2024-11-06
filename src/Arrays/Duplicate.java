package Arrays;

public class Duplicate {
    public static void Maximum(int arr[],int mx){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        int temp[]=new int[mx+1];
        for(int i=0;i<arr.length;i++){
            if(temp[arr[i]]==1){
                System.out.println("Duplicate"+arr[i]);
            }
            else{
                temp[arr[i]]=1;
            }
        }

    }

    public static void main(String[] args) {
        int arr[]={2,3,1,2,3,11,23,45,5,2};
        int max=Integer.MIN_VALUE;
        Maximum(arr,max);
    }
}
