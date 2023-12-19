package DSA;
import java.util.*;
public class bubblesort {
    public static void bs(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
              if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              }

                }

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
bs(arr);
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+" ");
}

    }
}
