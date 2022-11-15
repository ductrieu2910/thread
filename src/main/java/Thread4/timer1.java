/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread4;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class timer1 extends Thread {

    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nha vao so nguyen: ");
            do {
                do {
                    mainthread.n = sc.nextInt();
                } while (mainthread.n>20);
                mainthread.checkChange=true;
                Thread.sleep(5);
            } while (mainthread.n != 0);
        } catch (InterruptedException ex) {
            Logger.getLogger(timer1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
