package Chapter9.Three;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MorePracticeTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入借款金额：");
        long amount = Long.parseLong(scanner.nextLine());
        System.out.println("输入借款开始的年，月，日 ");
        System.out.println("年月日之间用-，/或.分隔\n例如：2018-2-12");
        String regex = "[-./]";
        String [] input = scanner.nextLine().split(regex);
        int year = Integer.parseInt(input[0]);
        int month = Integer.parseInt(input[1]);
        int day = Integer.parseInt(input[2]);
        LocalDate dateStart;
        dateStart = LocalDate.of(year, month, day);// LocalDate调用of方法，返回年月日分别是year,,month,day的dateStart对象
        System.out.println("输入结束的年，月，日:");
        input = scanner.nextLine().split(regex);
        year = Integer.parseInt(input[0]);
        month = Integer.parseInt(input[1]);
        day = Integer.parseInt(input[2]);
        LocalDate dateEnd;
        dateEnd = LocalDate.of(year, month, day);// LocalDate调用of方法返回年月日分别是year,,month,day的dateEnd对象
        long days = dateStart.until(dateEnd, ChronoUnit.DAYS);//得到dateStart和dateEnd相隔的天数
        boolean boo = dateEnd.isAfter(dateStart);//判断dateEnd是否在dateStart之后
        if(boo) {
            System.out.println(dateStart+"到"+dateEnd+"共"+Math.abs(days)+"天");
            // N天利息：贷款本金*年利率*N/360
            System.out.println("需要支付利息" + amount * 0.04350 * Math.abs(days) / 360 + "元");
        }
        else {
            System.out.println("还款日不能在借款日之前!");
        }
    }
}
