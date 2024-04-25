/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author Jaime
 */
public class Propiedades extends BasicComboBoxUI {    //PROPIEDADES DEL COMBOBOX DIVISA1
    public static ComboBoxUI createUI(JComponent com){
        return new Propiedades();
    }

    @Override
    protected JButton createArrowButton() {
        JButton  btn = new JButton();
        btn.setIcon(new ImageIcon(getClass().getResource("/Images/flecha.png")));
        return btn;
        
    }
    
}
