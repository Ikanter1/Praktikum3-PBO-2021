/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan3Rony;

/**
 *
 * @author LENOVO
 */
public class Tabung01 extends Bangun01{
    protected int t;

    public void setSuperPhi(double phi) {
        super.phi = phi;
    }
    public void setSuperR(int r){
    super.r = r;
    }
    public void setT(int t){
    this.t = t;
    }
    
    public void volume(){
        System.out.println("Volume Tabung adalah:  "+(super.phi*super.r*this.t));
    }
}
