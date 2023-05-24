//12S21040 - Sry Deviani Tambunan
// 12S21040 - Christina Putri Hutahaean

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeISBN, judulBuku, namaPenulis, tahunTerbit, namaPenerbit, formatBuku, kategoriRating, kategoriDiskon, kategoriTUB, pengulangan;
        double hargaPembelian, jenisMargin, rating, diskon;
        int stokBuku, percen;
        
        percen = 100;
        pengulangan = "SampaiAkhir";
        while (pengulangan.equals("SampaiAkhir")) {
            kodeISBN = input.nextLine();
            if (kodeISBN.equals("---")) {
                pengulangan = "Tidaksampaiakhir";
            } else {
                judulBuku = input.nextLine();
                namaPenulis = input.nextLine();
                tahunTerbit = input.nextLine();
                namaPenerbit = input.nextLine();
                formatBuku = input.nextLine();
                hargaPembelian = Double.parseDouble(input.nextLine());
                jenisMargin = Double.parseDouble(input.nextLine());
                diskon = jenisMargin / hargaPembelian * percen;
                stokBuku = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                kategoriDiskon = "";
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
                                kategoriRating = "Low";
                            }
                        }
                    }
                    if (diskon > 0) {
                        kategoriDiskon = "---";
                    } else {
                        if (diskon < -40) {
                            kategoriDiskon = "Once in a lifetime";
                        } else {
                            if (diskon < -20) {
                                kategoriDiskon = "Never come twice";
                            } else {
                                kategoriDiskon = "No regret";
                            }
                        }
                    }
                }
                if (rating >= 4.7) {
                    if (diskon < -40) {
                        kategoriTUB = "The ultimate best";
                    } else {
                        kategoriTUB = "---";
                    }
                } else {
                    kategoriDiskon = "---";
                }
            }
            System.out.println(kodeISBN + "|" + judulBuku + "|" + namaPenulis + "|" + tahunTerbit + "|" + namaPenerbit + "|" + formatBuku + "|" + hargaPembelian + "|" + jenisMargin + "|" + stokBuku + "|" + rating + "|" + kategoriRating + "|" + kategoriDiskon + "|" + kategoriTUB);
        }
    }
}
