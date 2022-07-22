package Oadsaheb.prr3;

import java.util.HashSet;

public class leaderInArray {
    public static void main(String[] args) {
        int arr[]={12,15,6,7,4,5,2};
        for (int i=0;i<arr.length;i++){
            boolean flag=false;
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]<arr[j]){
                    flag=true;
                    break;
                }
            }
            if (flag==false){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
