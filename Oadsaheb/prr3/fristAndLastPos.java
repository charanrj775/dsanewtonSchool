package Oadsaheb.prr3;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class fristAndLastPos {
    public static   int[] searchRange(int[] nums, int target) {


        int left = findLeftBound(nums, target);
        int right = findRightBound(nums, target);

        return new int[]{left, right};
    }

    public static int findLeftBound(int[] nums, int target) {
        int index = -1, low = 0, high = nums.length - 1;

        // Standard binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                high = mid - 1; // Look in the left sub-array
            }
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return index;
    }

    public static int findRightBound(int[] nums, int target) {
        int index = -1, low = 0, high = nums.length - 1;

        // Standard binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                low = mid + 1; // Look in the right sub-array
            }
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the element of the array");
        for (int i=0;i< nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target=sc.nextInt();

        int[] ans= searchRange(nums,target);
for (int i=0;i<ans.length;i++){
    System.out.println(ans[i]);
}

    }
}
