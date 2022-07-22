package Oadsaheb.prr3;
public class removeDuplicate {
    public static int removedup(int nums[]){
        int j=1;
        for (int i=0;i< nums.length-1;i++){
            if (nums[i]!=nums[i+1]){
                nums[j]=nums[i+1];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int nums[]={1,2,2,3,3,4,5,6};
        removedup(nums);
        int max=Integer.MIN_VALUE;
        for (int i=0;i< nums.length;i++){
            if (nums[i]>max){
                max=nums[i];
                System.out.print(max+" ");
            }
        }
    }
}
