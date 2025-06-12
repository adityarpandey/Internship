package practice;

public class SearchInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int check = 3;
        for (int i = 0; i < array.length; i++) {
            if (check == array[i]) {
                System.out.println("number is found in index " + i);
            }
        }
    }
}
