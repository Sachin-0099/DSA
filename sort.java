package DSA;
import java.util.*;
public class sort {
    public static void sort(int arr1[]){
        int low=0;
        int mid=0;
        int n=arr1.length;
        int high=n-1;
        while(mid<=high){
            if(arr1[mid]==0){
             Swap( arr1,low, mid);
               low++;
               mid++;
            }else if(arr1[mid]==1){
                mid++;

            }else{
            Swap(arr1,high,mid);
            high--;

            }
        }
    }
        static void Swap(int arr1[],int i ,int j){
            int temp=arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;

        }

       
    public static void printarr(int arr1[]){
        for(int i=0;i<arr1.length;i++){
       System.out.println(arr1[i]+" ");

        }
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many times you want to run the queries");
        int t=sc.nextInt();
        while(t>0){
        System.out.println("Enter the size of the array1");
        int n=sc.nextInt();
        int arr1[]=new int [n];
        for(int i=0;i<n;i++){
           arr1[i]=sc.nextInt();
        }
      sort(arr1);
      printarr(arr1);
            t--;
        }
}
    }
