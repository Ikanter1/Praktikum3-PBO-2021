/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author LENOVO
 */
public class MotorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Motor mtr = new Motor();
        mtr.printStatus();
        mtr.tambahKecepatan();
        
        mtr.nyalakanMesin();
        mtr.printStatus();
        
        mtr.tambahKecepatan();
        mtr.printStatus();
        
        mtr.tambahKecepatan();
        mtr.printStatus();
        
        mtr.tambahKecepatan();
        mtr.printStatus();
        
        mtr.matikanMesin();
        mtr.printStatus();
    }
    
}
