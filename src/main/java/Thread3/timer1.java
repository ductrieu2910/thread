/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread3;

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
             System.out.println("Nhap vao mot chuoi:");
            do {              
                mainthread.c = sc.nextLine();
                mainthread.checkChange = true;
                Thread.sleep(5);
            } while (mainthread.c.toLowerCase().equals("thoat") == false);
        } catch (InterruptedException ex) {
            Logger.getLogger(timer1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
