package a_encapsulation.method;

public class SpringConcert {

    public void start(){
        System.out.println("Spring Concert Started");

        Player player = new Player("바이올린");
        player.play();

        System.out.println("Spring Concert finished");
    }
}
