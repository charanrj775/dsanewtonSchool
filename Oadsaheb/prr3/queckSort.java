package Oadsaheb.prr3;

import java.util.Scanner;

public class queckSort {
    public static int partition(int arr[],int low,int highy){
     int pivot=arr[highy];
     int i=low-1;
     for (int j=low;j<highy;j++){
         if (arr[j]<pivot){
             i++;
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
         }
     }
     //swap with pivoit
        i++;
     int temp=arr[i];
     arr[i]=pivot;
     pivot=arr[i];
     return i;
    }
    public static void quickSort(int arr[],int low,int highy){
       if (low<highy){
           int pi=partition(arr,low,highy);
           quickSort(arr,low,pi-1);
           quickSort(arr,pi+1,highy);
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elemnt off array");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,n-1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }

    }
}
