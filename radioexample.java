// radio buttons

import javax.swing.*;


class radioexample{
    public static void main(String[] args){
        JFrame fr = new JFrame("radio example");
        JRadioButton rn1= new JRadioButton("male");
        JRadioButton rn2 = new JRadioButton("Female");
        rn1.setBounds(100,100,200,200);
        rn2.setBounds(300,100,200,200);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rn1);
        bg.add(rn2);
        fr.add(rn1);
        fr.add(rn2);

        fr.setSize(500,500);
        fr.setLayout(null);
        fr.setVisible(true);

    }
   
}