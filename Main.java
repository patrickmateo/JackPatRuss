/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JackPatRuss;

/**
 *
 * @author John Patrick Mateo
 */

import javax.swing.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    
 
    public static void main(String[] args) {
        
        try {
          javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
    } 
    catch (UnsupportedLookAndFeelException e) {
       // handle exception
    }
    catch (ClassNotFoundException e) {
       // handle exception
    }
    catch (InstantiationException e) {
       // handle exception
    }
    catch (IllegalAccessException e) {
       // handle exception
    }

    //new SwingApplication(); //Create and show the GUI.

        
        
        LibSys x = new LibSys();
        x.setVisible(true);
    }
    
}
