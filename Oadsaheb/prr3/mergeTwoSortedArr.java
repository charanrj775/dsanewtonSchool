package Oadsaheb.prr3;

public class mergeTwoSortedArr {
    public static int[] mergeTwoSortedArray(int nums1[],int nums2[]){
      int result[]=new int[nums1.length+ nums2.length];
      int i=0;
      int j=0;
      int k=0;
      while (i< nums1.length&&j< nums2.length){
          if (nums1[i]<nums2[j]){
              result[k]=nums1[i];
              i++;k++;
          }else {
              result[k]=nums2[j];
              j++;k++;
          }
      }
      while (i< nums1.length){
          result[k]=nums1[i];
          i++;k++;
      }
      while (j< nums2.length){
          result[k]=nums2[j];
          j++;k++;
      }
      return result;
    }
    public static void main(String[] args) {
        int nums1[]={1,4,7,9,22,43};
        int nums2[]={2,5,6,11,15,18,23,31,50,52,54,55};
             int merge[]= mergeTwoSortedArray(nums1,nums2);
        for (int i=0; i<merge.length;i++){
            System.out.print( merge[i]+" ");
        }
    }
}
