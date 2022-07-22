package Oadsaheb.prr3;

import java.util.HashSet;

public class ContainDuplicate {
    public static void main(String[] args) {
        int arr[] = { 2,2,5,7,9,5,9};

        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }

    public static boolean containsDuplicate(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num:arr) {
            if (hs.contains(num))
                return true;
            hs.add(num);



        }
        return false;
    }

}
