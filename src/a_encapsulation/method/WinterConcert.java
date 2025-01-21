package a_encapsulation.method;

public class WinterConcert {

    public void start(){
        System.out.println("Winter Concert Started");

        Player player = new Player("바이올린");
        player.play();

        System.out.println("Winter Concert finished");

    }
}
