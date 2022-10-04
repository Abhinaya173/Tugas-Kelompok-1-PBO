/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_kelompok_1_pbo;

/**
 *
 * @author user
 */
public class Pegawai{ 
    //properties
    public String Nama_Pegawai;
    public int Gaji_Pegawai;
    
    //constructor
    public Pegawai(String Nama_Pegawai, int Gaji_Pegawai){
        this.Nama_Pegawai = Nama_Pegawai;
        this.Gaji_Pegawai = Gaji_Pegawai;
    }
    
    //Overloading
    public int UbahGaji(int x){
        int TambahGaji = this.Gaji_Pegawai + x;
        return TambahGaji;
    }
    
    public int UbahGaji(int x, String alasan){  
        int KurangGaji = this.Gaji_Pegawai - x;
        return KurangGaji;
    }
    
    //Overriding
    public String CetakInfo(){
        return ("\nNama Pegawai :" + this.Nama_Pegawai + "\nGajiPegawai :" + this.Gaji_Pegawai + "\n");
    }
}
