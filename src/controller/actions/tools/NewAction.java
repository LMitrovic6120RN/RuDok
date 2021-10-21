package controller.actions.tools;

import controller.actions.AbstractRudokAction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class NewAction extends AbstractRudokAction {
    public NewAction(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON,new ImageIcon("icons\\New.png"));
        putValue(NAME, "New");
        putValue(SHORT_DESCRIPTION, "New");

    }


    public void actionPerformed(ActionEvent e) {


    }
}
