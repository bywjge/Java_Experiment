package Chapter8.Three;

public class JavaFile extends EditFile {
    public void choiceEditTool() {
        System.out.println("用文本编辑器编写Java源文件.");
    }
    public void inputContent(){
        System.out.println("输入的内容是:");
        System.out.println("class E { \n}");
    }
    public void saveFile(){
        System.out.println("文件的名字是某个类的名字,扩展名是java.");
    }
}
