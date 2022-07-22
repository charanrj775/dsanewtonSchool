package Oadsaheb.prr3;

import java.util.Scanner;

public class moiveAllZerotoEnd {
    public static void movieZero(int nums[]){
      int insertindex=0;
      for (int i=0;i<nums.length;i++){
          if (nums[i]!=0){
              nums[insertindex]=nums[i];
              insertindex++;
          }
      }
      while (insertindex<nums.length){
          nums[insertindex]=0;
          insertindex++;
      }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of zero");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the element of arrays");
        for (int i=0;i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        movieZero(nums);
        for (int i=0;i< nums.length;i++){
            System.out.println(nums[i]+" " );
        }
    }
}
