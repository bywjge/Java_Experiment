package Chapter4.Two;

public class User {
    public static void main(String[] args) {
        CD dataCD = new CD();
        int[] b = {1,2,3,4,5,6,7,8};
        dataCD.setSize(b.length);
        dataCD.setContent(b);
        int[] a = dataCD.getContent();
        System.out.println("dataCD上的内容：");
        for (int j : a) System.out.printf("%3d", j);

        Computer computerIMB = new Computer();
        computerIMB.putCD(dataCD);//computerIMB调用putCD(CD cd)方法,将dataCD的引用传递给cd
        System.out.println("\n将dataCD的数据复制到计算机:computerIMB.");
        computerIMB.copyToComputer();//computerIMB调用copyToComputer()方法
        System.out.println("computerIMB上的内容：");
        computerIMB.showData();
        int m=12;
        System.out.println("\ncomputerIMB将每个数据增加"+m);
        computerIMB.addData(m);
        System.out.println("computerIMB将增值后的数据复制到CD:dataCD");
        computerIMB.copyToCD();//computerIMB调用copyToCD()方法
        System.out.println("dataCD上的内容：");
        a=dataCD.getContent();
        for (int j : a) System.out.printf("%3d", j);


        System.out.println();
        // 主类中再增加一个CD对象，然后将计算机中的数据(data数组)复制到CD对象中。
        CD dataCD1 = new CD();
        dataCD1.setSize(1000);
        computerIMB.putCD(dataCD1);
        computerIMB.copyToCD(a);
        //放张CD进电脑，电脑的数据就被复写了？这是什么新的操作？写出这个实验的真是个人才！
        System.out.println("dataCD1上的内容：");
        b=dataCD.getContent();
        for (int j : b) System.out.printf("%3d", j);
    }

}
