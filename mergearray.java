package DSA;

public class mergearray {
    public static void mergesort(int arr3[]){//brute force solution
        for(int i=0;i<arr3.length;i++){
            int j=i-1;
            int temp=arr3[i];
            while(j>=0 && arr3[j]>temp){
                arr3[j+1]=arr3[j];
                j--;

            }
            arr3[j+1]=temp;
        }
    }
 
    
    public static void main(String args []){
        int arr1[]={2,6,9,15};
        int arr2[]={1,4,6,7};
            int a=arr1.length;
        int b=arr2.length;
        int c1=a+b;
        int arr3[]=new int[c1];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[a+i]=arr2[i];

        }
        // for(int i=0;i<c1;i++){
        //     System.out.println(arr3[i]+" ");
        // }
        mergesort(arr3);
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]+" ");
        }
  
    
    }
    
}
