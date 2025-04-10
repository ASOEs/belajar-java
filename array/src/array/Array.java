/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS VIVO
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // penggunaan array dinamis dalam java
    
    ArrayList<String> nama = new ArrayList<>();
    Scanner inputan = new Scanner(System.in);
    
    String namaLengkap, lanjut;
    
    //menampilkan menu
    System.out.println("Menu");
    String[] menu = {
      "1. Menmabahkan nama",
      "2. Menampilkan daftar nama",
      "3. Menghapus nama"
    };
    
    
        System.out.println("===== MENU =====");
        for (String item : menu){
            System.out.println(item);
        }
        System.out.print("\nMasukan pilihan: ");
        
        int pilihan = inputan.nextInt();
        inputan.nextLine();
        switch (pilihan) {
            case 1:
                // memasukan nama
                do{
                    System.out.print("Masukan nama yang ingin anda masukan kedalam array: ");
                    namaLengkap = inputan.nextLine();
                    nama.add(namaLengkap);


                    System.out.print("\nApakah anda ingin lanjut?");
                    lanjut = inputan.nextLine();
                }while(lanjut.equalsIgnoreCase("Y"));
                break;
            case 2:
                System.out.println("Menampilkan nama");
                for (String n : nama){
                    System.out.println("- "+ n );
                }
                break;
            case 3:
            default:
                throw new AssertionError();
        }
    

    
    
    
    
    }
    
}
