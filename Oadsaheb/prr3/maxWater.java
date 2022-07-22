package Oadsaheb.prr3;

import java.util.Scanner;

public class maxWater {
     public static int max_water(int arr[]){
         int l=0;
         int h=arr.length-1;
         int max=0;
         while (l<h){
             int lh=arr[l];
             int hh=arr[h];
             int min_h=Math.min(lh,hh);
             int len=h-l;
             int current_area=len*min_h;
             max=Math.max(max,current_area);
             if(lh<hh){
                 l++;
             }else {
                 h--;
             }
         }
         return max;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enetr the element of array");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans=max_water(arr);
        System.out.println("maximum water container is: "+ans);
    }
}
