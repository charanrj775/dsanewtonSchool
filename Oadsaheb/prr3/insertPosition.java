package Oadsaheb.prr3;

import java.util.Scanner;

public class insertPosition {
    public static int searchInsert(int[] nums, int target) {


        int low = 0;
        int high = nums.length-1;
        int mid;
        while(low<=high)
        {
            mid = low + (high-low)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                low = mid+1;
            else
                high = mid-1;
        }
        return low;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the Element of arrays");
        for (int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target value");
        int target=sc.nextInt();
        System.out.println(searchInsert(nums,target));
    }
}
