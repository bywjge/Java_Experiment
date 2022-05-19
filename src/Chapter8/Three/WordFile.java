package Chapter8.Three;

public class WordFile extends EditFile {
    public void choiceEditTool() {
        System.out.println("用Microsoft Word编写Word文件.");
    }
    public void inputContent(){
        System.out.println("输入的内容是:简历内容.");
    }
    public void saveFile(){
        System.out.println("文件的名字是resume,扩展名是word.");
    }
}
