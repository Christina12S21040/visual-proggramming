// 12S21040- Christina Putri Hutahaean
// 12S21033- Sry Deviani Tambunan

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeISBN, judulBuku, namaPenulis, tahunTerbit, namaPenerbit, formatBuku, kategoriRating;
        
        kategoriRating = " ";
        double hargaPembelian, minimumMargin, rating;
        int stokBuku;
        
        kodeISBN = input.nextLine();
        judulBuku = input.nextLine();
        namaPenulis = input.nextLine();
        tahunTerbit = input.nextLine();
        namaPenerbit = input.nextLine();
        if (namaPenerbit.equals("---")) {
            namaPenerbit = "---";
        }
        formatBuku = input.nextLine();
        hargaPembelian = input.nextDouble();
        minimumMargin = input.nextDouble();
        stokBuku = input.nextInt();
        rating = input.nextDouble();
        if (rating >= 4.7) {
            kategoriRating = "Best Pick";
        } else {
            if (rating >= 4.5) {
                kategoriRating = "Must Read";
            } else {
                if (rating >= 4.0) {
                    kategoriRating = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        kategoriRating = "Average";
                    } else {
                        if (rating <= 3.0) {
                            kategoriRating = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(kodeISBN + "|" + judulBuku + "|" + namaPenulis + "|" + tahunTerbit + "|" + namaPenerbit + "|" + formatBuku + "|" + hargaPembelian + "|" + minimumMargin + "|" + stokBuku + "|" + rating + "|" + kategoriRating);
    }
}
