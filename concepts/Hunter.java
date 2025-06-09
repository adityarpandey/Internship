package concepts;

public interface Hunter {
    default void flee(String task){
        System.out.println("Hunt");
    }
}
