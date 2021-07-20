/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbram;

import java.util.Scanner;

/**
 *
 * @author 62822
 */
public class TugasBram {

    // Method
    public static void main(String[] args) {

        String kalimat = "Kemarin Tidak Cerah Tetapi Hujan";
        Scanner scnr = new Scanner(System.in);
        System.out.print(">> Masukkan Kalimat : ");
        kalimat = scnr.nextLine();

        StringBuilder kalimatBaru = new StringBuilder();
        // Split kalimat menjadi beberapa kata:
        // ["halo", "apa", "kabar", "semua"]
        for (String kata : kalimat.split(" ")) {
            
            //kata.substring(0, 1), mengambil character pertama pada kata
            //toUpperCase() untuk mengubah character pertama jadi huruf kapital
            // kata.substring(1), mengambil character kedua sampai terakhir pada kata
            String kataBaru = kata.substring(0,1).toUpperCase()+ kata.substring(1).toLowerCase();

            kalimatBaru.append(kataBaru).append(" ");
        }
        System.out.println("Hasil = " +kalimatBaru); // Kemarin Tidak Cerah Tetapi Hujan
        System.out.println("Berhasil Simpan Text!");
    }
}
