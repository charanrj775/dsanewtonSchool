package Oadsaheb.prr3;

public class singelNumber {
    public static int singel_number(int nums[]){
     int xor=0;
     for (int num:nums){
         xor=xor^num;
     }

     return xor;
    }


    public static void main(String[] args) {
        int nums[]={4,1,2,1,4,5,2};
        int ans=singel_number(nums);
        System.out.println(ans);
    }
}
