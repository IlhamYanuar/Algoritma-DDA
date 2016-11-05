/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dda;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author IlhamYanuar
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    
    public Main() {
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
                     
        JFrame frame = new JFrame("algoritma garis dda");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        garis grs = new garis();
        grs.setx1(100);
        grs.sety1(300);
        grs.setx2(400);
        grs.sety2(300);
        grs.setBackground(Color.BLACK);
        frame.add(grs);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}
