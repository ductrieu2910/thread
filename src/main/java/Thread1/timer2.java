/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread1;

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
            while (mainthread.c != 0) {
                if (mainthread.checkChange == true) {
                    System.out.println("c= " + mainthread.c);
                    if (isPrime(mainthread.c)) {
                        System.out.println(mainthread.c + " la so nguyen to!");
                    } else {
                        System.out.println(mainthread.c + " khong la so nguyen to");
                    }
                }
                mainthread.checkChange=false;
                Thread.sleep(10);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(timer2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
