package controller.actions.tools;

import controller.actions.AbstractRudokAction;
import view.dialogs.InfoDialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class InfoAction extends AbstractRudokAction {
    public InfoAction(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        putValue(SMALL_ICON, new ImageIcon("icons\\Info.png"));
        putValue(NAME, "Info");
        putValue(SHORT_DESCRIPTION, "Info");

    }


    public void actionPerformed(ActionEvent e) {
        InfoDialog dialog = new InfoDialog();
    }
}
