package practice;

public class RemovingUnwanted {
    public static void main(String[] args) {
        String str = "@#$%^&*(       programing in java";
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(str);
    }
}
