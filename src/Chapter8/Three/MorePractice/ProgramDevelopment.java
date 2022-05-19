package Chapter8.Three.MorePractice;

public abstract class ProgramDevelopment {
    public abstract void writeSourceFiles();
    public abstract void compile();
    public abstract void run();
    public final void devStep(){
        writeSourceFiles();
        compile();
        run();
    }

}
