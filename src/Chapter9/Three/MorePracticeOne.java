package Chapter9.Three;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MorePracticeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入开始的年，月，日 ");
        System.out.println("年月日之间用-，/或.分隔\n例如：2018-2-12");
        String regex = "[-./]";
        String [] input = scanner.nextLine().split(regex);
        int year = Integer.parseInt(input[0]);
        int month = Integer.parseInt(input[1]);
        int day = Integer.parseInt(input[2]);
        LocalDate dateStart;
        dateStart = LocalDate.of(year, month, day);// LocalDate调用of方法，返回年月日分别是year,,month,day的dateStart对象
        System.out.print("输入结束的年，月，日:");
        input = scanner.nextLine().split(regex);
        year = Integer.parseInt(input[0]);
        month = Integer.parseInt(input[1]);
        day = Integer.parseInt(input[2]);
        LocalDate dateEnd;
        dateEnd = LocalDate.of(year, month, day);// LocalDate调用of方法返回年月日分别是year,,month,day的dateEnd对象
        long days = dateStart.until(dateEnd, ChronoUnit.WEEKS);//得到dateStart和dateEnd相隔的天数
        boolean boo = dateEnd.isAfter(dateStart);//判断dateEnd是否在dateStart之后
        if(boo)
            System.out.println(dateEnd+"在"+dateStart+"之后");
        System.out.println(dateStart+"和"+dateEnd+"相隔：");
        System.out.println(Math.abs(days)+"周(不足一周按0周计算)");
    }
}
