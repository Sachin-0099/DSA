package DSA;

public class quicksort {
    public static void Quicksort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pIdx=partition(arr,si,ei);
        Quicksort(arr, si, pIdx-1);
        Quicksort(arr, pIdx+1, ei);

    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;//to make place for the smaller element
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
          i++;
                int temp=pivot;
                arr[ei]=arr[i];
                arr[i]=temp;
                return i;
    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args []){
        int arr[]={6,3,9,8,2,5};
        Quicksort(arr, 0, arr.length-1);
        PrintArr(arr);
    }
}
