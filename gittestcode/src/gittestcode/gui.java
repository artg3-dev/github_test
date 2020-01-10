/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittestcode;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author A3
 */
public class gui implements Runnable{

    public gui() {
    }

    @Override
    public void run() {
        JFrame frame = new JFrame("Hi!");
        frame.setSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new JLabel("Hello World!"));
        
        frame.pack();
        frame.setVisible(true);
    }
    
}
