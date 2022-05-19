package Chapter8.Three.MorePractice;

public class GoDev extends ProgramDevelopment{
    @Override
    public void writeSourceFiles() {
        System.out.println("用GoLand编写Go代码");
    }

    @Override
    public void compile() {
        System.out.println("编译Go");
    }

    @Override
    public void run() {
        System.out.println("运行Go编译生成的文件");
    }
}
