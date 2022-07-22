package Oadsaheb;
import java.lang.module.FindException;
import java.util.*;
public class PPR {
    public static void main(String[] args) {
   int arr[]={2,55,4,3,7,88,11};
for (int i=0;i<arr.length-1;i++){
    for (int j=i+1;j>0;j--){
        if (arr[j]<arr[j-1]){
            int temp =arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
        }else {
            break;
        }
    }
}
for (int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }

}