package com.helloworld.helloworld;

public class ElseIfStatement {
    public static void main(String[] args) {
        var nilai = 70; // Mendefinisikan variabel 'nilai' dengan nilai 70
        var absen = 90; // Mendefinisikan variabel 'nilai' dengan nilai 70

        if (nilai >= 80 && absen >= 80) { // Memulai blok if untuk mengevaluasi apakah nilai dan absen lebih besar atau sama dengan 80
            System.out.println("Nilai Anda A");  // Jika kedua syarat terpenuhi, mencetak "Nilai Anda A"
        } // Jika syarat di atas tidak terpenuhi, maka akan dilanjutkan ke blok else if berikutnya
        else if (nilai >= 70 && absen >= 70) { // Jika syarat di atas tidak terpenuhi, maka akan dilanjutkan ke blok else if berikutnya 
            System.out.println("Nilai Anda B"); // Jika syarat terpenuhi, mencetak "Nilai Anda B"
        } // Jika syarat terpenuhi, mencetak "Nilai Anda B"
        else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }
    }
}
