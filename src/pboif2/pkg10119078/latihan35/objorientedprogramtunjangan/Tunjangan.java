/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan35.objorientedprogramtunjangan;

/**
 *
 * @author ryzen
 */
public class Tunjangan {

    public double tunjangan;
    

    public double hasilTunjangan(String parStatus, int parGaji){
        parStatus = parStatus.toUpperCase();
        if (parStatus.equals("MENIKAH")){
            System.out.println("Gaji pokok\t: Rp. " + (double)parGaji);
            tunjangan = parGaji * 0.35;
            System.out.println("Tunjangan\t: Rp. " + tunjangan);
            System.out.println("Total Gaji\t: Rp. " + ((double)parGaji + tunjangan));
        }
        else{
            System.out.println("Gaji pokok\t: Rp. " + (double)parGaji);
            tunjangan = parGaji * 0;
            System.out.println("Tunjangan\t: Rp. " + tunjangan);
            System.out.println("Total Gaji\t: Rp. " + ((double)parGaji + tunjangan));
        }
        return(tunjangan);
    }
    
    
}
