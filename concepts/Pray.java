package concepts;

public interface Pray {
    default void flee(String task){
        System.out.println("Prey");
    }
}
