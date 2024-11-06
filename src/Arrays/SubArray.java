package Arrays;

public class SubArray {
    public static void SubArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                System.out.print('[');
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    if(k<j){
                        System.out.print(',');
                    }
                }
                System.out.print(']');
                System.out.println();
            }

        }

    }

    public  static int Kadanes_Algo(int arr[]){
        int sum=0;int max=arr[0];
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,-2,4,-8,2};
//        SubArray(arr);
        System.out.println(Kadanes_Algo(arr));
    }
}
