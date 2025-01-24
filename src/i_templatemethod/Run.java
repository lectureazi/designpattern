package i_templatemethod;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Warrior warrior = new Warrior("강사", 200, 15, 10);
        Monster monster = new Monster("고블린", 200, 15, 10);

        System.out.println(monster.getName() + " 등장하였습니다.");
        System.out.println("전투를 시작합니다.");

        while(true){

            if(warrior.isDead()){
                System.out.println("졌습니다.");
                break;
            }

            if(monster.isDead()){
                System.out.println("이겼습니다.");
                break;
            }

            System.out.println("\n=========================\n");
            sc.nextLine();

            warrior.attack(monster);
            monster.attack(warrior);

            System.out.println(warrior.getName() + " 체력: " + warrior.getCurrentHp());
            System.out.println(monster.getName() + " 체력: " + monster.getCurrentHp());
        }
    }
}

















