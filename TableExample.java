//The JTable class is used to display data in tabular form. It is composed of rows and columns.
import java.awt.*;
import javax.swing.*;

class TableExample{
    public static void main(String args[])
    {
        JFrame fr = new JFrame("frame");
        String data[][]={{"101","sagar","87000"},
        {"102","Jayanta","78000"}};
        String column[] = {"ID","NAME","SALARY"};
        JTable jt = new JTable(data,column);
        jt.setBounds(20,40,200,300);
        JScrollPane sp = new JScrollPane(jt);
        fr.add(sp);
        fr.setVisible(true);
        fr.setSize(400,400);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        


 


    }
}