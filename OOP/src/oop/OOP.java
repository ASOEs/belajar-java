/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

public class OOP {
    public static void main(String[] args) {     
        System.out.println("");
        System.out.println("===== Percobaan Setter and Getter =====");
        mahasiswa mhs = new mahasiswa("Achmad","20","2301508");
        
        System.out.println("nama: " + mhs.nama);
        System.out.println("Umur: " + mhs.umur);
        System.out.println("NIM: " + mhs.getNim()); 
    }
    
}

    //percobaan membuat oop
class segitiga{
    double tinggi,alas;
    
    public segitiga(double tinggi, double alas){
        this.tinggi = tinggi;
        this.alas = alas;
    }
    
    double hitungSegitiga(){
        return 0.5 * alas * tinggi;
    }
   
}


class  mahasiswa{
    public String nama,umur;
    private String nim;
    
    public mahasiswa(String nama, String umur, String nim){
        this.nama = nama;
        this.umur = umur;
        this.nim = nim;
    }
    
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getNim(){
            return nim;
    }
}




