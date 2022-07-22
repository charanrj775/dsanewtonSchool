package Oadsaheb.prr3;

public class sumOfUnickElement {
    public static void main(String[] args) {
        int nums[]={1,2,3,2};

        int[] counter = new int[101];
        for (int i : nums) {
            ++counter[i];
        }
        int ans=0;
        for (int i = 0; i < 101; ++i) {
            if (counter[i] == 1) {
                ans += i;
            }

        }
        System.out.println(ans);

    }
}
