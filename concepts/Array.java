package concepts;

public class Array {
    public static void main(String[] args) {
        String[] fruits = {"apple" , "mango"};
        int numOfFruit= fruits.length;
        System.out.println(numOfFruit);
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }



}
