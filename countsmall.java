package DSA;

public class countsmall {
    public static void countsmall(int arr1[],int arr2[]){
int i=arr1.length;
int j=arr2.length;
while(i>0){
    if(arr1[i]>arr2[j]){
  System.out.println(arr2[j]);
    }else{
        System.out.println(arr1[i]);
    }System.out.println();
    i--;
}

}  public static void main(String args []){
    int arr1[]={2};
    int arr2[]={5,1};
    countsmall(arr1,arr2);
  }  
}
