package concepts;

public class Jungle {
    public static void main(String[] args) {




        Fish fish = new Fish();
        fish.flee("Hunt");
        fish.flee("check");
        System.out.println(fish.getClass().equals(Fish.class));
    }
}
