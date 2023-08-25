package com.helloworld.helloworld;

public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 70; // Mendefinisikan variabel 'absen' dengan nilai 70
        var nilaiAkhir = 80; //Mendefinisikan variabel 'nilaiAkhir' dengan nilai 80
    
        var lulusanAbsen = absen >= 75; //Mengevaluasi apakah 'absen' lebih besar atau sama dengan 75
        var lulusanNilaiAkhir = nilaiAkhir >= 75; // Mengevaluasi apakah 'nilaiAkhir' lebih besar atau sama dengan 75
    
        var lulus = lulusanAbsen && lulusanNilaiAkhir; // Menggabungkan hasil evaluasi 'lulusanAbsen' dan 'lulusanNilaiAkhir' dengan operator logika AND (&&)
    
        System.out.print(lulus); // Menampilkan hasil dari variabel 'lulus'
    }
}
