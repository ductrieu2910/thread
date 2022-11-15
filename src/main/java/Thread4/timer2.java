/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class timer2 extends Thread {

    @Override
    public void run() {
        try {
            while (mainthread.n != 0) {
                if (mainthread.checkChange == true) {
                    if (mainthread.checkChange == true) {
                        System.out.println("n=" + mainthread.n);
                        int s = 1;
                        for (int i = 1; i <= mainthread.n; i++) {
                            s *= i;
                        }
                         System.out.println(mainthread.n + "! = " + s);
                    }
                }
                mainthread.checkChange=false;
                Thread.sleep(10);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(timer2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
