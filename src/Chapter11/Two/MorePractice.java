package Chapter11.Two;

import javax.swing.*;

public class MorePractice {
    public static void main(String[] args) {
        String str = "";
        boolean inputComplete=false;
        while(!inputComplete) {
            str = JOptionPane.showInputDialog(null, "请输入字符串", "输入对话框", JOptionPane.PLAIN_MESSAGE); //弹出输入对话框
            try {
                if(str.length()<=10)
                    inputComplete = true;
                else throw new RuntimeException();
            }
            catch(RuntimeException exp) {
                JOptionPane.showMessageDialog(null, "输入错误", "警告对话框", JOptionPane.WARNING_MESSAGE); //弹出输入对话框//弹出消息对话框
            }
        }
        System.out.println("字符串的长度为:" + str.length());
    }
}
