package a_encapsulation.method;

public class Player {

    // 객체는 자율성을 지녀야한다.
    private String instrument;

    public Player(String instrument) {
        this.instrument = instrument;
    }

    public void play(){
        prepare();
        playing();
        stop();
        leave();
    }

    private void prepare(){
        System.out.println("Preparing " + instrument + "연주");
    }

    private void playing(){
        System.out.println(instrument+ "를 연주하고 있습니다.");
    }

    private void stop(){
        System.out.println("연주를 멈춥니다.");
    }

    private void leave(){
        System.out.println("무대를 떠납니다.");
    }


}
