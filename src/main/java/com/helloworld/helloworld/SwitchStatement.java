package com.helloworld.helloworld;

public class SwitchStatement {
    public static void main(String[] args){
        var nilai = "A";         // Mendefinisikan variabel 'nilai' dengan nilai "A"

        switch (nilai){ // Memulai switch statement dengan variabel 'nilai' sebagai ekspresi
            case "A": // Jika nilai adalah "A", jalankan blok case ini
                System.out.println("Wow Anda lulus dengan baik");
                break;
            case "B": // Jika nilai adalah "B" atau "C", jalankan blok case ini
            case "C":
                System.out.println("Anda lulus");
                break; 
            case "D": // Jika nilai adalah "D", jalankan blok case ini
                System.out.println("Anda Tidak lulus");
                break;
            default: // Jika nilai tidak cocok dengan case di atas, jalankan blok default
                System.out.println("Mungkin anda salah jurusan aowkoaokwo");
        }
    }
}
