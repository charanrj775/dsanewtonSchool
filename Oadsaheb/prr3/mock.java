package Oadsaheb.prr3;

import java.util.HashSet;

public class mock {
    public static void main(String[] args) {
        int arr[]={1,1,3,3,5,4,4,2,2};
        int ans=isDuplicate(arr);
        System.out.println(ans);

    }
    public static int isDuplicate(int [] arr){
        
        HashSet<Integer>hs=new HashSet<>();

        for (int i=0;i< arr.length;i++){
          if  (hs.contains(arr[i])){

              hs.add(arr[i]);
              return arr[i];
          }else {
              return arr[i];

          }


        }
        return -1;
    }
}
