package concepts;

public class Fish implements Pray,Hunter {
    @Override
    public void flee(String task) {
        if(task.equals("Hunt"))
            Hunter.super.flee(task);
        else
            Pray.super.flee(task);
    }

//    @Override
//    public void flee(){
//        System.out.println("fleeing");
//    }
//    @Override
//    public void flee(){
//        System.out.println("hunting");
//    }

}
