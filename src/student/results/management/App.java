/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.results.management;

import javax.swing.JFrame;
import student.results.management.view.*;

/**
 *
 * @author Lakmal
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame l = new administrator();
        l.pack();
        l.setLocationRelativeTo(null);
        l.setVisible(true);
    }
}