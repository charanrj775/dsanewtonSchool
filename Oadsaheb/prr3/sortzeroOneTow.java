package Oadsaheb.prr3;

public class sortzeroOneTow {
    public static void main(String[] args) {

int arr[]={0,2,1,2,0};
int low=0;
int mid=0;
int highy= arr.length-1;
while (low<highy){
    if (arr[mid]==0){
        int temp=arr[mid];
        arr[mid]=arr[low];
        arr[low]=temp;
        low++;
        mid++;
    }
    if (arr[mid]==1){
        mid++;
    }
    if (arr[mid]==2){
        int temp2=arr[mid];
        arr[mid]=arr[highy];
        arr[highy]=temp2;
        highy--;

    }

}
for (int i=0;i< arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }

}