package Arrays;
import  java.util.Arrays;
public class Intersection {
    public static int[] Intersection_of_Array(int arr1[],int arr2[]){
        int i=0;int j=0; int k=0;
        int temp[]=new int[Math.min(arr1.length,arr2.length)];
        while(i<arr1.length & j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                if(k==0 ||temp[k-1]!=arr1[i]){
                    temp[k++]=arr1[i];

                }
                i++;
                j++;
            }

        }
        return Arrays.copyOf(temp,k);
    }
    public static void main(String[] args) {
        int arr1[]={4,5,6,8,9};
        int arr2[]={5,6,9,10,12};
        int result[]=Intersection_of_Array(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }
}
