package com.helloworld.helloworld;

public class SwitchDenganYield {
    public static void main(String[] args) {
        var nilai ="A"; // Mendefinisikan variabel 'nilai' dengan nilai "A", mewakili kategori nilai siswa.


        String ucapan = switch (nilai) { // Memulai pernyataan switch dengan penggunaan yield untuk mengevaluasi nilai siswa.
            
        case "A": // Jika nilai sama dengan "A", hasilkan pesan "Wow Anda Lulus Dengan Baik".
        yield "Wow Anda Lulus Dengan Baik";

           // Jika nilai sama dengan "B" atau "C", hasilkan pesan "Anda Lulus".
        case "B", "C":
        yield "Anda Lulus";

        case "D": // Jika nilai sama dengan "D", hasilkan pesan "Anda Tidak Lulus".
        yield "Anda Tidak Lulus";

        default: // Jika nilai tidak sama dengan kondisi di atas, hasilkan pesan "Mungkin Anda Salah Jurusan".
        yield "Mungkin Anda Salah Jurusan";
    };
    System.out.println(ucapan); // Mencetak pesan yang dihasilkan dari switch ke layar.
    }
}
