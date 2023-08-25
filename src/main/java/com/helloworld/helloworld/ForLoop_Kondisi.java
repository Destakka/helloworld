package com.helloworld.helloworld;

public class ForLoop_Kondisi {
    public static void main(String[] args) {
        var counter = 1; // Mendefinisikan variabel 'counter' dengan nilai awal 1
        for (; counter <= 10; ){ // Memulai perulangan for dengan kondisi: selama 'counter' kurang dari atau sama dengan 10
            System.out.println("Perulangan ke-" + counter); // Mencetak pesan "Perulangan ke-" dan nilai 'counter'
            counter++; // Meningkatkan nilai 'counter' sebesar 1
        }
    }
}
