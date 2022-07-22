package Oadsaheb.prr3;

public class seprateapositiveNegetive {
    public static void main(String[] args) {
        int nums[]={1,-3,22,4,-17,5,6,-8};

        int a[]=new int[nums.length];
        int m=0;
        int b[]=new int[nums.length];
        int n=0;
        int k=0;
        for (int i=0;i< nums.length;i++) {
            if (nums[i] < 0) {
                a[m++] = nums[i];
            }  else if (nums[i]>0)
            {
                b[n++] = nums[i];
            }
        }

        int i=0;
        while (i<m){
            if (k< a.length){
                nums[k++]=a[i++];
            }
        }
        int s=0;
        for ( i=0;i<b.length;i++){
           if (k< nums.length){
              nums[k]=b[s];
               k++;s++;
          }
      }
        for (int j=0;j< nums.length;j++){
            System.out.print(nums[j]+" ");
        }
    }
}
