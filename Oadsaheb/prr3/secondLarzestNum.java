package Oadsaheb.prr3;

import java.util.Scanner;

public class secondLarzestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int second_max=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
        if (arr[i]>max){
            second_max=max;
            max=arr[i];
        } else if(arr[i]>second_max&&arr[i]!=max){
             second_max=arr[i];
            }
        }
        System.out.println("second larzest number is:  "+second_max);
    }
}
