/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_kelompok_1_pbo;

/**
 *
 * @author user
 */
public class KantinTest {
    public static void main(String[] args) {
        Kantin Lala = new Kantin("505");
        
        System.out.println(Lala.CetakInfo());
        
        Stand stand1 = new Stand(1, 5000);
        System.out.println(stand1);
        
        Costumer Cstmer1 = new Costumer(2, 15000, "Albert", "Ayam Goreng", "Lalapan");
        Pegawai Pgw1 = new Pegawai("Jonathan", 3000000);
        
        System.out.println(Cstmer1.CetakInfo());
        System.out.println(Pgw1.CetakInfo());
       
        Pegawai Linda = new Pegawai("Linda", 70000000);
        System.out.println(Linda.CetakInfo());
    }
}
