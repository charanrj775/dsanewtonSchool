package Oadsaheb.prr3;

public class findDuplicate {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
         int ans= findDuplicate(arr);
        System.out.println(ans);
    }
    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    int temp=arr[i];
                    arr[i]=arr[correct];
                    arr[correct]=temp;
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }


}
