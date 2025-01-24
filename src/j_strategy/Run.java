package j_strategy;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player player = new Player("강사", 200, 15, 10);
        Monster monster = new Monster("고블린", 200, 15, 10);

        System.out.println(monster.getName() + " 등장하였습니다.");
        System.out.println("전투를 시작합니다.");

        player.equippedWeapon(new Shield("나무방패", 3, 1));

        while(true){

            if(player.isDead()){
                System.out.println("졌습니다.");
                break;
            }

            if(monster.isDead()){
                System.out.println("이겼습니다.");
                break;
            }

            System.out.println("\n=========================\n");
            sc.nextLine();

            player.attack(monster);
            monster.attack(player);

            player.equippedWeapon(new Sword("엑스칼리버", 10000, 1));
            System.out.println(player.getName() + " 체력: " + player.getCurrentHp());
            System.out.println(monster.getName() + " 체력: " + monster.getCurrentHp());
        }
    }
}

















