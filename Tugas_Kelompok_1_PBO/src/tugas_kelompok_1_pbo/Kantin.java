/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_kelompok_1_pbo;

/**
 *
 * @author user
 */
public class Kantin { 
    public String ID_Kantin;
    int ID;
    
    public Kantin(String ID_Kantin){
        this.ID_Kantin = ID_Kantin;
        this.ID = Integer.parseInt(this.ID_Kantin); //CASTING
    }
    
    public String CetakInfo(){
        return ("\nNomor ID kantin :" + this.ID +  "\n");
    }
    
}
