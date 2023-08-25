package com.helloworld.helloworld;

public class Break {
    public static void main(String[] args) {
        var counter = 1; // Mendefinisikan variabel 'counter' dengan nilai awal 1
        
        while (true) { // Mendefinisikan variabel 'counter' dengan nilai awal 1
            System.out.println("Perulangan Ke-" +counter); // Mendefinisikan variabel 'counter' dengan nilai awal 1
            counter++; // Meningkatkan nilai 'counter' sebesar 1

            if (counter > 10){ // Mengecek apakah nilai 'counter' lebih dari 10
                break; // Jika nilai 'counter' lebih dari 10, keluar dari perulangan menggunakan break
            }
        }
    }
    
}
