package Chapter11.One;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FontDialog extends JDialog implements ItemListener, ActionListener {
    FontFamilyNames fontFamilyNames;
    int fontSize = 38;
    String fontName;
    String fontShape;
    //实验后的练习  新增fontShape
    JComboBox fontNameList, fontSizeList, fontShapeList;
    JLabel label;
    Font font;
    JButton yes, cancel;
    static int YES = 1, NO = 0;
    int state = -1;

    FontDialog(JFrame f) {
        super(f);
        setTitle("字体对话框");
        font = new Font("宋体", Font.PLAIN, 12);
        fontFamilyNames = new FontFamilyNames();
        setModal(true); //当前对话框调用setModal(boolean b)设置为有模式
        yes = new JButton("Yes");
        cancel = new JButton("cancel");
        yes.addActionListener(this);
        cancel.addActionListener(this);
        label = new JLabel("hello,奥运", JLabel.CENTER);
        fontNameList = new JComboBox();
        fontSizeList = new JComboBox();
        fontShapeList = new JComboBox();
        String[] name = fontFamilyNames.getFontName();
        fontNameList.addItem("字体");
        for (String s : name) fontNameList.addItem(s);
        fontSizeList.addItem("大小");
        for (int k = 8; k < 72; k = k + 2)
            fontSizeList.addItem(k);
        fontShapeList.addItem("字形");
        fontShapeList.addItem("常规");
        fontShapeList.addItem("加粗");
        fontShapeList.addItem("斜体");
        fontShapeList.addItem("加粗斜体");
        fontNameList.addItemListener(this);
        fontSizeList.addItemListener(this);
        fontShapeList.addItemListener(this);
        JPanel pNorth = new JPanel();
        pNorth.add(fontNameList);
        pNorth.add(fontSizeList);
        pNorth.add(fontShapeList);
        add(pNorth, BorderLayout.NORTH);
        add(label, BorderLayout.CENTER);
        JPanel pSouth = new JPanel();
        pSouth.add(yes);
        pSouth.add(cancel);
        add(pSouth, BorderLayout.SOUTH);
        setBounds(100, 100, 480, 170);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        validate();
    }
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==fontNameList) {
            fontName=(String)fontNameList.getSelectedItem();
            font=new Font(fontName,Font.PLAIN,fontSize);
        }
        else if(e.getSource()==fontSizeList) {
            fontSize= (Integer)fontSizeList.getSelectedItem();
            font=new Font(fontName,Font.PLAIN,fontSize);
        }
        else if(e.getSource()==fontShapeList) {
            fontShape= (String) fontShapeList.getSelectedItem();
            // 新增
            switch (fontShape) {
                case "常规":font=new Font(fontName,Font.PLAIN,fontSize);break;
                case "加粗":font=new Font(fontName,Font.BOLD,fontSize);break;
                case "斜体":font=new Font(fontName,Font.ITALIC,fontSize);break;
                case "加粗斜体":font=new Font(fontName,Font.ITALIC+Font.BOLD,fontSize);break;
            }
        }
        label.setFont(font);
        label.repaint();
        validate();
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==yes) {
            state=YES;
            setVisible(false);//对话框设置为不可见
        }
        else if(e.getSource()==cancel) {
            state=NO;
            setVisible(false);        //对话框设置为不可见
        }
    }
    public int getState() {
        return state;
    }
    public Font getFont() {
        return font;
    }

}
