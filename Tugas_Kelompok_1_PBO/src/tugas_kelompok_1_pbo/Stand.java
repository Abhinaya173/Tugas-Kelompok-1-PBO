/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_kelompok_1_pbo;

/**
 *
 * @author user
 */
public class Stand { 
    //properties
    public int Nomor;
    public int Harga;
    
    //constructor
    public Stand(int Nomor, int Harga){
        this.Nomor = Nomor;
         this.Harga = Harga;
    }
    
    
    
    public String toString(){
        return ("\nNomor Stand :" + this.Nomor + "\n" + "Harga Stand :" + this.Harga + "\n");
    }

}
