package Oadsaheb.prr3;

public class slectionSort {
    public static void main(String[] args) {
        int arr[]={14,17,12,13,6,2,3};
        for (int i=0;i< arr.length;i++){
            int minindex=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;

        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
