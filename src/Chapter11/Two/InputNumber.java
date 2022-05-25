package Chapter11.Two;

import javax.swing.*;

public class InputNumber {
    public static void main(String[] args) {
        double result=0;
        boolean inputComplete=false;
        while(!inputComplete) {
            String str= JOptionPane.showInputDialog(null, "输入一个正数", "输入对话框", JOptionPane.PLAIN_MESSAGE); //弹出输入对话框
            try {
                result = Double.parseDouble(str);
                if(result>=0)
                    inputComplete = true;
                else throw new NumberFormatException();
            }
            catch(NumberFormatException exp) {
                JOptionPane.showMessageDialog(null, "输入了非法字符", "警告对话框", JOptionPane.WARNING_MESSAGE); //弹出输入对话框//弹出消息对话框
            }
        }
        double sqrtRoot = Math.sqrt(result);
        System.out.println(result+"平方根:"+sqrtRoot);
    }

}
