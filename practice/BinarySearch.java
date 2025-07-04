package practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        int l = 0;
        int h = a.length - 1;
        boolean flag = true;


        //if(h%2 == 0 ){
        //  int mid = even(h);
        //}else{
        //  int mid = odd(h);
        //}

        while (l <= h) {
            int mid = (h - l) / 2;
            if (a[mid] == key) {
                System.out.println("element found " + a[mid - 1]);
                flag = false;
                break;
            }
            if (a[mid] < key) {
                l = mid + 1;
            }
            if (a[mid] > key) {
                h = mid - 1;
            }


        }


    }

    static int even(int length) {

        int mid = length / 2;

        return mid;
    }

    static int odd(int length) {

        int mid = (length - 1) / 2;

        return mid;
    }
}
