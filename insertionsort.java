package DSA;

import java.util.Scanner;

public class insertionsort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
        int j=i-1;
        int temp=arr[i];
        while(j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;

            }
        }
    
    public static void main(String args []){
    Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=sc.nextInt();
System.out.println("enter the elements of the array");
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
insertion(arr);
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
}
}

