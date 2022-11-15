/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread3;
import java.util.StringTokenizer;
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
            while(mainthread.c.toLowerCase().equals("thoat")==false){               
               if(mainthread.checkChange==true){
                   System.out.println("c: "+mainthread.c);
                   StringTokenizer stk=new StringTokenizer(mainthread.c);
                   int count=stk.countTokens();
                   System.out.println("So tu: "+count);
                   mainthread.checkChange=false;
                   Thread.sleep(10);
               }
           }
        } catch (InterruptedException ex) {
            Logger.getLogger(timer1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
