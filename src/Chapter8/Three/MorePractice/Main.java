package Chapter8.Three.MorePractice;

public class Main {
    public static void main(String[] args) {
        ProgramDevelopment programDevelopment = new JavaDev();
        programDevelopment.devStep();
        programDevelopment = new GoDev();
        System.out.println();
        programDevelopment.devStep();

    }
}
