/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package miumg.edu.gt.nodesheet;

import javax.swing.JFrame;
import miumg.edu.gt.nodesheet.View.Libro;
import miumg.edu.gt.nodesheet.View.SplashScreen;
import miumg.edu.gt.nodesheet.View.login;

/**
 *
 * @author joses
 */
public class NodeSheet {

    public static void main(String[] args) {
        
       // crear ventana del splash
        JFrame splashFrame = new JFrame();
//        splashFrame.setUndecorated(true);
        splashFrame.setSize(10000, 500);
 splashFrame.setLocationRelativeTo(null);

        SplashScreen splash = new SplashScreen();
        splashFrame.add(splash);

        splashFrame.setVisible(true);

        try {
            Thread.sleep(3000); // 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        splashFrame.dispose(); // cerrar splash

        Libro book = new Libro();
        book.setVisible(true);
    }
}
