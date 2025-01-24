package l_proxy;

public class DeveloperProxy implements Developer{

    private Developer developer;

    public DeveloperProxy(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void develop() {

        System.out.println("출근 카드를 찍는다.");

        try {
            // 핵심 로직은 real subject에게 위임
            developer.develop();
        }catch (Exception e){
            System.out.println("앗 쉬는 날이었다.");
        }finally {
            System.out.println("집에 간다.");
        }
    }
}
