package Arrays;

public class Sort_Negtive_Positive {
    public static void Printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int arr[]){
        int i=0;
        int j= arr.length-1;
        while(i<=j){
            if(arr[i]<0& arr[j]>0){
                i++;
                j--;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
               i++;
               j--;
            }
        }
    }


    public static void main(String[] args) {
        int arr[]={-1,4,-3,-5,2};
          Sort(arr);
          Printarray(arr);
    }
}
