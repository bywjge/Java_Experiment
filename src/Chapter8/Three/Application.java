package Chapter8.Three;

public class Application{  //使用模板方法模式给出的类
    public static void main(String[] args) {
        EditFile edit=new JavaFile();
        edit.editStep();
        edit=new WordFile();
        edit.editStep();
    }
}


