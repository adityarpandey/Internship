package concepts;

public class Generic {
    public static void main(String[] args) {
        GenericBox<Integer> genericbox = new GenericBox<>();
        genericbox.setNum(5);
        genericbox.getNum();
        System.out.println(genericbox.getNum());
    }
}
