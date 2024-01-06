package DSA;

public class mergesort {
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //kaam
        int mid=si+(ei-si)/2;/*we can also use mid formula as mid=(si+ei)/2 but
         we are not using this because there is chance overflow when big data type come */
         mergesort(arr, si, mid);//for left
         mergesort(arr, mid+1, ei);//for right
         merge(arr,si,mid,ei);
    }
         //merge method to merge the sorted element
         public static void merge(int arr[],int si,int mid,int ei){
            int i=si;
            int j=mid+1;
            int k=0;
            int temp[]=new int[ei-si+1];
            while(i<=mid && j<=ei){
                if(arr[i]<arr[j]){
                    temp[k]=arr[i];
                    k++;
                    i++;
                }else{
                    temp[k]=arr[j];
                    k++;
                    j++;
                }
            }
                //left part
                while(i<=mid){
                    temp[k++]=arr[i++];

                }
            
                //Right part
                while(j<=ei){
                    temp[k++]=arr[j++];
                }
                //Copy temp to original 
                for(k=0, i=si;k<temp.length;k++,i++){
                arr[i]=temp[k];

            }
         }
    

    public static void main(String args []){
        int arr[]={6,3,9,5,2,8};
mergesort(arr, 0, arr.length-1);
PrintArr(arr);

    }
    }
