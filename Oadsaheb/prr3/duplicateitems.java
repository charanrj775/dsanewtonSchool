package Oadsaheb.prr3;

import java.util.HashSet;
import java.util.Scanner;

public class duplicateitems {
    public static int repeate(int arr[]){
        HashSet<Integer>hs=new HashSet<>();
        for (int i=0;i< arr.length;i++){
            if (hs.contains(arr[i])!= hs.contains(arr[i+1]))
                return arr[i];
                hs.add(arr[i]);

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
       int size= sc.nextInt();
       int arr[]=new int[size];
       System.out.println("Enter the element of array:");
       for (int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt();
      }

        int ans=repeate(arr);
        System.out.println(ans + "  is the non repeating Element.");
    }
}
