package Chapter3.Two;

import java.util.Scanner;

public class MachineSell {
    public static void main(String[] args){
        int money;
        int drinkKind;
        System.out.print("投入金额:2或3元或5元(回车确认):");
        Scanner reader=new Scanner(System.in);
        money=reader.nextInt();
        if(money==2) {
            System.out.print("选择净净矿泉水(1),甜甜矿泉水(2)和美美矿泉水(3)之一:\n");
            System.out.print("输入1,2或3:");
            drinkKind=reader.nextInt();
            switch(drinkKind) {
                case 1 : System.out.print("得到净净矿泉水\n");
                    break;
                case 2 : System.out.print("得到甜甜矿泉水\n");
                    break;
                case 3 : System.out.print("得到美美矿泉水\n");
                    break;
                default: System.out.print("选择错误");
            }
        }
        else if(money==3) {
            System.out.print("选择爽口可乐(1),清凉雪碧(2),和雪山果汁(3)之一:\n");
            System.out.print("输入1,2或3:");
            drinkKind=reader.nextInt();
            switch(drinkKind) {
                case 1 : System.out.print("得到爽口可乐\n");
                    break;
                case 2 : System.out.print("得到清凉雪碧\n");
                    break;
                case 3 : System.out.print("得到雪山果汁\n");
                    break;
                default: System.out.print("选择错误");
            }
        }
        else if(money==5) {
            System.out.print("选择草原奶茶(1),青青咖啡(2),和甜美酸奶(3)之一:\n");
            System.out.print("输入1,2或3:");
            drinkKind=reader.nextInt();
            switch(drinkKind) {
                case 1 : System.out.print("得到草原奶茶\n");
                    break;
                case 2 : System.out.print("得到青青咖啡\n");
                    break;
                case 3 : System.out.print("得到甜美酸奶\n");
                    break;
                default: System.out.print("选择错误");
            }
        }
        else {
            System.out.print("输入的钱币不符合要求");
        }
    }
}
