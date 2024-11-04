/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.pertemuan6;

import java.util.Scanner;

/**
 *  Nama      : MOHAMMAD FAJAR SUBECHI
 *  NIM       : 23176012
 *  Prodi     : Sistem InfOrmasi
 *  Deskripsi : program ini untuk mengeja nama yang diinputkan user
 * @author ACER
 */
public class SI_RegPagi_23176012_EjaanNama {
public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputan = new Scanner(System.in);
        
        boolean ulangi = true;
        while(ulangi){
            System.out.print("Masukan nama depan anda untuk dieja : ");            
            String nama = inputan.nextLine();
            
            System.out.println("Ejaan untuk '"+nama+"' adalah ");            
            int panjangNama = nama.length();
            for(int i = 0; i<panjangNama; i++){
                char huruf = nama.charAt(i);
                System.out.println("Huruf ke-"+(i+1)+" : "+huruf);
            }
            
            System.out.print("Ulangi Aktifitas? (ya/tidak)");
            String ulang = inputan.nextLine().toUpperCase();
            
            if(ulang.equals("YA")){
                System.out.println("Program akan diulangi");
            }else if(ulang.equals("TIDAK")){
                System.out.println("Program berhenti terimakasih");
                ulangi = false;
            }
        }
        
    }    
}
