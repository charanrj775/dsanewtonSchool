package Oadsaheb.prr3;

import java.util.HashMap;
import java.util.Scanner;

public class towSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int target=sc.nextInt();
      int result[]=  two_sum(arr,target);
      for (int i=0;i< result.length;i++){
          System.out.print(result[i]+"+");
      }

    }
    public static int[] two_sum(int arr[],int target){
        int [] result=new int[2];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int comp=target-arr[i];
            if(hm.containsKey(comp)){
                result[0]=hm.get(comp);
                result[1]=i;
            }else{
              hm.put(arr[i],i);

            }
        }
        return result;
    }
    }

