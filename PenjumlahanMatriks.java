import java.util.Scanner;

public class PenjumlahanMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input ukuran matriks
        System.out.println("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.println("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        // input elemen matriks pertama 
        System.out.println("\nMasukkan elemen matriks pertama: ");
        for (int i = 0; i < kolom; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("Elemen [" + i + "][ " + j + "]");
                matriks1[i][j] = input.nextInt();
     }
        
}

        // input elemen matriks kedua 
        System.out.println("\nMasukkan elemen matriks kedua: ");
        for (int i = 0; i < kolom; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("Elemen [" + i + "][ " + j + "]");
                matriks1[i][j] = input.nextInt();
            }
        }

        // Proses penjumlahan 
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        // Menampilkan hasil
        System.out.println("\nHasil Penjumlahan Matriks: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < baris; j++) {
                System.out.println(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
} 


