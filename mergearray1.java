package DSA;
import java.util.*;
public class mergearray1 {
    public static int[] sort(int arr1[],int arr2[]){
      int ans[]=new int[arr1.length+arr2.length];
         int i=0, j=0 , k=0;
        while(i<arr1.length && j<arr2.length){
                if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;

               }
               else{
                ans[k]=arr2[j];
                k++;
                j++;
               }
            }

               while(i<arr1.length){
                ans[k]=arr1[i];
                k++;
                i++;
               }
               while(j<arr2.length){
                ans[k]=arr2[j];
                k++;
                j++;
               }

           return ans;
        
    }

    public static void main(String args []){
     Scanner sc=new Scanner(System.in);
     System.out.println("How many times you want to ru the queries");
     int t=sc.nextInt();
     while(t>0){
     System.out.println("Enter the size of the array1");
     int n=sc.nextInt();
     int arr1[]=new int [n];
     for(int i=0;i<n;i++){
        arr1[i]=sc.nextInt();
     }
     System.out.println("Enter the size of the array2");
     int m=sc.nextInt();
     int arr2[]=new int[m];
     for(int i=0;i<m;i++){
        arr2[i]=sc.nextInt();
     }
     int arr[]=new int[n+m];
arr=     sort(arr1,arr2);
     for(int i=0;i<n+m;i++){
        System.out.print(arr[i]+" ");
     }
     System.out.println();

t--;
    
    }
}
}
