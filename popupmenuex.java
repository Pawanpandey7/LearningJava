//JPopupMenu is used creating popups dynamically on a specified position

// JPopupMenu(): creates a popup menu with empty name
// JPopupMenu(String name): creates a popup menu with specified title
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

class popupmenuex{
    public static void main(String[] args)
    {
        JFrame fr = new JFrame("popup menu example");
        JPopupMenu pop = new JPopupMenu();
        JMenuItem save = new JMenuItem("save");
        JMenuItem edit = new JMenuItem("edit");
        pop.add(save);
        pop.add(edit);
        fr.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                if(SwingUtilities.isRightMouseButton(e)){
                    pop.show(fr,e.getX(),e.getY());
                }
            }
        });
        fr.setVisible(true);
        fr.setSize(400,400);
    

        
    }
}