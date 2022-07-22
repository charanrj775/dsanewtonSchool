package Oadsaheb.prr3;


public class leader {
    public static void main(String[] args) {


        int arr[] = {16, 17, 4, 3, 5, 2};
        boolean ans = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    ans = true;
                    break;
                } else {
                    System.out.println(arr[i] + " ");
                }


            }
        }
    }
}
