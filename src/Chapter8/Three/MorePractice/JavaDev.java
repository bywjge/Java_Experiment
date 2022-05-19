package Chapter8.Three.MorePractice;

public class JavaDev extends ProgramDevelopment{
    @Override
    public void writeSourceFiles() {
        System.out.println("用IDEA编写Java代码");
    }

    @Override
    public void compile() {
        System.out.println("编译Java");
    }

    @Override
    public void run() {
        System.out.println("运行Java编译生成的文件");
    }
}
