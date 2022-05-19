package Chapter8.Three;

public abstract class EditFile {  //抽象模板
    public abstract void choiceEditTool();
    public abstract void inputContent();
    public abstract void saveFile();
    public final void editStep() {  //模板方法
        choiceEditTool();
        inputContent();
        saveFile();
    }
}
