/*
 * NAMA: Adam Firdaus Darmawan
 * NIM: 10119078
 * KELAS: IF-2
 * DESKRIPSI: berisi codingan untuk menampilkan program tunjangan
 */
package pboif2.pkg10119078.latihan35.objorientedprogramtunjangan;

import java.util.Scanner;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan35ObjOrientedProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int gaji;
        String status;
        
        Scanner scanner = new Scanner(System.in);
        
        Tunjangan tunjangan = new Tunjangan();
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        gaji = scanner.nextInt();   
        System.out.printf("Status anda? (Menikah/Belum) : ");
        status = scanner.next();
        tunjangan.hasilTunjangan(status,gaji);
    }
    
}
