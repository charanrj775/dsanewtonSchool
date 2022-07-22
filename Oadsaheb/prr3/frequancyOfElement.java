package Oadsaheb.prr3;

public class frequancyOfElement {
    public static void main(String[] args) {
        int arr[]= {2,4,5,2,6,6,3,7,2,5,5,5};
        int visitedArr[]=new int[arr.length];
        int visite=-1;
        for (int i=0;i< arr.length;i++){
           int count=1;
           for (int j=i+1;j< arr.length;j++){
               if (arr[i]==arr[j]){
                   count++;
               visitedArr[j]=visite;
               }
           }

    if (visitedArr[i]!=visite){
        visitedArr[i]=count;
       }
        }
        for (int i=0;i< visitedArr.length;i++){
            if (visitedArr[i]!=visite){
           System.out.println("frequency of arr element: "+ arr[i]+": "+visitedArr[i]);
          }
        }
    }
}
