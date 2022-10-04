/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_kelompok_1_pbo;

/**
 *
 * @author user
 */
public class Costumer extends Stand{ //Inheritance
    //properties
    public String Nama_Costumer;
    public String Order;
    public String Menu;
    
    //constructor
    public Costumer(int a,int b, String Nama_Costumer, String Order, String Menu){
        super(a,b);
        this.Nama_Costumer = Nama_Costumer;
        this.Order = Order;
        this.Menu = Menu;
    }
    
    //Overriding
    public String CetakInfo(){
        return (super.toString() + "\nNama Costumer :" + this.Nama_Costumer + "\nOrder :" + this.Order +"\nMenu :" + this.Menu + "\n");
    }
}
