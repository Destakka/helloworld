package com.helloworld.helloworld;

public class Continue {
    public static void main(String[] args) {
        
        for (int counter = 1; counter <=100; counter++){ // Melakukan perulangan for dari 1 hingga 100
            if (counter % 2 == 0) { // Memeriksa apakah nilai 'counter' adalah bilangan genap
                continue; // Jika nilai 'counter' adalah bilangan genap, lompati iterasi berikutnya menggunakan continue
            }

            System.out.println("Perulangan Ganjil=" + counter); // Jika nilai 'counter' bukan bilangan genap, cetak pesan "Perulangan Ganjil=" dan nilai 'counter'
        }
    }
    
}
