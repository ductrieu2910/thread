/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread1;

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
        System.out.println("Nhap so 1 tu ban phim");
        Scanner sc = new Scanner(System.in);
        try {
            do {
                mainthread.c = sc.nextInt();
                mainthread.checkChange=true;
                Thread.sleep(5);
            } while (mainthread.c != 0);
        }
         catch (InterruptedException ex) {
            Logger.getLogger(timer1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
