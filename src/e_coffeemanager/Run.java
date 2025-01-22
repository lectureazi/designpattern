package e_coffeemanager;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        int balance = 100000;
        int expenses = 0;
        int salesPrice = 0;

        String americanoName = "americano";
        int americanoPrice = 1000;
        int americanoPurchasePrice = 500;
        int americanoStock = 10;
        int americanoSafetyStock = 3;
        int americanoSalesCnt = 0;

        String mochaName = "mocha";
        int mochaPrice = 2000;
        int mochaPurchasePrice = 800;
        int mochaStock = 10;
        int mochaSafetyStock = 3;
        int mochaSalesCnt = 0;

        String latteName = "latte";
        int lattePrice = 3000;
        int lattePurchasePrice = 100000;
        int latteStock = 10;
        int latteSafetyStock = 3;
        int latteSalesCnt = 0;

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("\n=========Menu=========");
            System.out.println("판매등록(1)");
            System.out.println("현황(2)");
            System.out.println("종료(3)");
            System.out.print("입력 : ");

            int menu = sc.nextInt();

            if(menu < 1 || menu > 3) {
                System.out.println("* 올바른 매뉴번호를 입력해 주세요");
                continue;
            }

            if(menu == 1) {
                System.out.println("\n=========List========= ");
                System.out.println(americanoName + "(0)");
                System.out.println(mochaName + "(1)");
                System.out.println(latteName + "(2)");

                System.out.print("\n* 판매한 커피코드 : ");
                int code = sc.nextInt();

                if(code < 0 || code > 2) {
                    System.out.println("정확한 상품번호를 선택해 주세요.");
                    return;
                }

                if(code == 0) {

                }else if(code == 1) {

                }else {

                }

            }else if(menu == 2) {

                System.out.println("\n=========현황========= ");
                System.out.printf("%-10s 재고(%3d) 판매량(%3d) \n", americanoName, americanoStock, americanoSalesCnt);
                System.out.printf("%-10s 재고(%3d) 판매량(%3d) \n", mochaName, mochaStock, mochaSalesCnt);
                System.out.printf("%-10s 재고(%3d) 판매량(%3d) \n", latteName, latteStock, latteSalesCnt);
                System.out.println("\n잔고(" + balance + ") 매출(" + salesPrice + ") 지출(" + expenses + ")");

            }else  {
                System.out.println("* 종료합니다.");
                return;
            }
        }
    }
}
