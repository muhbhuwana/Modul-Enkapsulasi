/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author MuhammadBhuwana
 */
public class Bola {
    private double jari_jari;
    public void bola(){
        
    }
    public void setjari_jari(double jari){
        this.jari_jari=jari;
    }
    public void showDiameter(){
        double diameter;
        diameter=2*jari_jari;
        System.out.println("diameternya adalah "+diameter);
    }
    public void showluaspermukaan(){
        double lp;
        lp=4*Math.PI*jari_jari*jari_jari;
        System.out.println("luas permukaannya adalah "+lp);
    }
    public void showvolume(){
        double volume;
        volume=(4/3)*Math.PI*jari_jari*jari_jari*jari_jari;
        System.out.println("volumenya adalah "+volume);
    }
}
