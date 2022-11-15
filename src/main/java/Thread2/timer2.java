/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class timer2 extends Thread{

    @Override
    public void run() {
        try {
            while (mainthread.s.toLowerCase().equals("thoat")==false) {                
                if(mainthread.checkChange==true){
                    System.out.println("s="+mainthread.s);
                    StringBuilder str=new StringBuilder(mainthread.s);
                    System.out.println("Chuoi dao: "+str.reverse().toString());
                    mainthread.checkChange=false;
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(timer1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
