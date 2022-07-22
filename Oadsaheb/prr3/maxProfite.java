package Oadsaheb.prr3;

import java.util.Scanner;

public class maxProfite {
    public static int max_profit(int prices[]){
        int MinPrice=Integer.MAX_VALUE;
        int overallprofit=0;
        int currentprofit=0;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<MinPrice){
                MinPrice=prices[i];
            }
            currentprofit=prices[i]-MinPrice;
            if (currentprofit>overallprofit){
                overallprofit=currentprofit;
            }
        }
      return overallprofit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter teh size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of arrays");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(max_profit(arr));
    }
}
