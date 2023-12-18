package DSA;

import java.util.Scanner;

public class bs {
    public static int binarysearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;

            } if(arr[mid]>key){
                end=mid-1;
            }else{
               start= mid+1;
            }
        }
        return -1;
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);

   System.out.println("Enter the size of the array");
   int n=sc.nextInt();
   int arr[]=new int[n];
   System.out.println("Enter the elements of the array");
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   System.out.println("Enter the key");
   int key=sc.nextInt();

      System.out.println(binarysearch(arr,key));
    }
}

