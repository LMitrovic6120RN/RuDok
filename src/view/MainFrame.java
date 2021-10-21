package view;


import controller.actions.ActionManager;
import view.bars.MyMenuBar;
import view.bars.MyToolBar;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static MainFrame instance;
    private ActionManager actionManager;
    private JToolBar toolBar;
    private JMenuBar menuBar;

    private MainFrame(){

    }
    private void initialise(){
        actionManager = new ActionManager();
        initialiseGUI();
    }
    private void initialiseGUI(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int sirina = screenSize.width;
        int visina = screenSize.height;
        setSize(1400, 900);
        //setVisible(true);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("RuDok");
        toolBar = new MyToolBar();

        menuBar = new MyMenuBar();
        setJMenuBar(menuBar);
        add(toolBar, BorderLayout.NORTH);
        JPanel pGlavni = new JPanel();
        JScrollPane pLevi = new JScrollPane();
        pLevi.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        JPanel pDesni = new JPanel();
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pLevi, pDesni);
        splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(250);
        Dimension minSize = new Dimension(200,50);
        pLevi.setMinimumSize(minSize);
        pDesni.setMinimumSize(minSize);
        add(splitPane);







    }
    public static MainFrame getInstance(){
        if (instance == null){
            instance = new MainFrame();
            instance.initialise();
        }
        return instance;
    }

    public ActionManager getActionManager() {
        return actionManager;
    }
}
