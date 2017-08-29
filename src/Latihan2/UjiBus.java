/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author MuhammadBhuwana
 */
public class UjiBus {
    public static void main(String[] arg){
       
        //membuat objek busBesar dari class Bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(1);//menambah 15 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(1);//menambah 5 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(1);//menambah 26 penumpang
        busBesar.cetak();
    }
    
}
