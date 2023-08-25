package com.helloworld.helloworld;

public class IfStatement {
    public static void main(String[] args) {
        var nilai = 78; // Mendefinisikan variabel 'nilai' dengan nilai 78
            var absen = 75; // Mendefinisikan variabel 'nilai' dengan nilai 78
    
            if (nilai >= 75 && absen >= 75) { // Memulai pernyataan if untuk mengevaluasi apakah nilai dan absen lebih besar atau sama dengan 75
                System.out.println("Anda Lulus"); // Jika kedua syarat terpenuhi, mencetak "Anda Lulus"
            }
            else { // Jika syarat di atas tidak terpenuhi, menjalankan bagian else
                System.out.println("Anda Tidak Lulus"); // Mencetak "Anda Tidak Lulus"
            }
        }
    }
