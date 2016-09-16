package edu.uniminuto.proyecto1.main;

import edu.uniminuto.proyecto1.pantalla.InputFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * La clase main.java ejecuta la aplicación Proyecto1.
 *
 * @author fbeltra6uniminuto.edu.co
 * @version 1.0
 * @since 16-11-2016
 */
public class Proyecto1 {

    /**
     * Método main para iniciar la aplicación.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Look and Feel Nimbus*/
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (LookAndFeelInfo nimbus : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(nimbus.getName())) {
                    UIManager.setLookAndFeel(nimbus.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Instancia de la pantalla inicial */
        new InputFrame().setVisible(true);
    }

}
