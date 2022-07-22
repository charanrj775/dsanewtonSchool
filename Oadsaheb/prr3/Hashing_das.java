package Oadsaheb.prr3;

import java.util.HashSet;

public class Hashing_das {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(4);
        hs.add(6);
        hs.add(2);
        //how to find size of hashset
        System.out.println("size of hashset is: "+hs.size());
        hs.add(7);
        hs.add(9);
        hs.add(2);
        System.out.println("size of hashset is: "+hs.size());
        //search in hashset...
        if (hs.contains(2)){
            System.out.println("present");
        }
        if (!hs.contains(8)){
            System.out.println("absent");
        }
        //delete opration in hashset....

        hs.remove(2);
        System.out.println("size of hashset is: "+hs.size());
        //print all element ..
        System.out.println(hs);

    }
}
