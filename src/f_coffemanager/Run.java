package f_coffemanager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        int balance = 100000;
        int expenses = 0;
        int salesPrice = 0;

        Coffee americano = new Coffee("americano", 1000, 500, 10, 3, 0);
        Coffee mocha = new Coffee("mocha", 2000, 800, 10, 3, 0);
        Coffee latte = new Coffee("latte", 3000, 1000, 10, 3, 0);
        Coffee espresso = new Coffee("espresso", 10000, 4000, 10, 3, 0);

        Coffee[] coffees = {americano, mocha, latte, espresso};
        Scanner sc = new Scanner(System.in);

        while (true) {

            try {
                System.out.println("\n=========Menu=========");
                System.out.println("판매등록(1)");
                System.out.println("현황(2)");
                System.out.println("종료(3)");
                System.out.print("입력 : ");

                int menu = sc.nextInt();

                if (menu < 1 || menu > 3) {
                    System.out.println("* 올바른 매뉴번호를 입력해 주세요");
                    continue;
                }

                if (menu == 1) {
                    System.out.println("\n=========List========= ");
                    for (int i = 0; i < coffees.length; i++) {
                        System.out.println(coffees[i].getName() + "(" + i + ")");
                    }

                    System.out.print("\n* 판매한 커피코드 : ");

                    int code = sc.nextInt();
                    if (code < 0 || code >= coffees.length) {
                        System.out.println("정확한 상품번호를 선택해 주세요.");
                        continue;
                    }

                    Coffee coffee = coffees[code];

                    System.out.print("* 판매량 : ");
                    int orderCnt = sc.nextInt();

                    if (orderCnt < 0 || orderCnt > coffee.getStock()) {
                        System.out.println("* system: 재고 부족으로 주문이 취소되었습니다.");
                        continue;
                    }

                    int paymentPrice = coffee.getPrice() * orderCnt; // 결재금액
                    coffee.setStock(coffee.getStock() - orderCnt); // 재고 차감
                    coffee.setSalesCnt(coffee.getSalesCnt() + orderCnt); // 판매량 추가

                    balance += paymentPrice; // 잔고 반영
                    salesPrice += paymentPrice; // 매출액 반영

                    System.out.println("\n주문 : " + coffee.getName() + "[" + orderCnt + "잔]");
                    System.out.println("결제금액 : " + paymentPrice);

                    if (coffee.getStock() < coffee.getSafetyStock()) {
                        int purchaseCnt = coffee.getSafetyStock() * 2;
                        int purchasePrice = coffee.getPurchasePrice() * purchaseCnt;
                        if (purchasePrice > balance) {
                            System.out.println("* system: 잔고 부족으로 매입이 취소되었습니다.");
                            continue;
                        }

                        System.out.println("* system: " + coffee.getName() + " [" + purchaseCnt + "잔] 매입하였습니다.");

                        balance -= purchasePrice;
                        expenses += purchasePrice;
                        coffee.setStock(coffee.getStock() + purchaseCnt);
                    }
                } else if (menu == 2) {
                    System.out.println("\n=========현황========= ");
                    for (Coffee coffee : coffees) {
                        System.out.printf("%-10s 재고(%3d) 판매량(%3d) \n", coffee.getName(), coffee.getStock(), coffee.getSalesCnt());
                    }

                    System.out.println("\n잔고(" + balance + ") 매출(" + salesPrice + ") 지출(" + expenses + ")");
                } else {
                    System.out.println("* 종료합니다.");
                    return;
                }
            } catch (InputMismatchException e) {
                System.out.println("* 숫자를 입력하세요.");
                sc.next();
                continue;
            }
        }
    }
}
