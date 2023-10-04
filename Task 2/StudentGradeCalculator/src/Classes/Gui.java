/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mohamed
 */
public class Gui {
    public static void centerframe(JFrame frame){
        Rectangle rectangle = frame.getBounds();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((dimension.width - rectangle.width)/2,(dimension.height - rectangle.height)/2);
    }
    public void setIcon(JFrame frame){
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Asset/check-list.png")));
    }
    public static void message(String msg,int errorType){
        switch(errorType){
            case 0:
                JOptionPane.showMessageDialog(null,msg,"Error",JOptionPane.ERROR_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(null,msg,"Success",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,msg,"Warning",JOptionPane.WARNING_MESSAGE);
                break;
            default:
                break;
        }
    }
}
