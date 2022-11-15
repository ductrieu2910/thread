/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Thread1;

/**
 *
 * @author Administrator
 */
public class mainthread {
    public static int c=1;
    public static boolean checkChange=false;
    public static void main(String[] args) {
        System.out.println("MainThread");
        timer1 t1=new timer1();
        timer2 t2=new timer2();
        t1.start();
        t2.start();
    }
}
