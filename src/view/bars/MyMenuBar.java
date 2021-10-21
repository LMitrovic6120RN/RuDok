package view.bars;



import view.MainFrame;

import javax.swing.*;

public class MyMenuBar extends JMenuBar{
    public MyMenuBar(){



        JMenu mFile = new JMenu("File");
        mFile.add(MainFrame.getInstance().getActionManager().getNewAction());
        mFile.addSeparator();
        JMenu mHelp = new JMenu("Help");
        JMenuItem hEdit = new JMenuItem("Edit");
        mHelp.add(hEdit);
        add(mFile);
        add(mHelp);




    }


}
