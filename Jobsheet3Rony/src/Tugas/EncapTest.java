/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author LENOVO
 */
public class EncapTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EncapeDemo encap = new EncapeDemo();
        EncapeDemo encap1 = new EncapeDemo();
        EncapeDemo encap2 = new EncapeDemo();
        
        encap.setName("Rony");
        encap.setAge(17);
        System.out.println("Name : " +encap.getName());
        System.out.println("Age : " +encap.getAge());
        
        encap1.setName("Rony");
        encap1.setAge(35);
        System.out.println("Name : " +encap1.getName());
        System.out.println("Age : " +encap1.getAge());
        
        encap2.setName("Rony");
        encap2.setAge(21);
        System.out.println("Name : " +encap2.getName());
        System.out.println("Age : " +encap2.getAge());
        
        
    }
    
}
