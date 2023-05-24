// 12S21040 - Christina Putri Hutahaean

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int stokBuku;
        String kodeISBN, judulBuku, namaPenulis, tahunTerbit, namaPenerbit, formatBuku;
        double hargaPembelian, minimumMargin, rating;
        
        kodeISBN = input.nextLine();
        judulBuku = input.nextLine();
        namaPenulis = input.nextLine();
        tahunTerbit = input.nextLine();
        namaPenerbit = input.nextLine();
        formatBuku = input.nextLine();
        hargaPembelian = input.nextDouble();
        minimumMargin = input.nextDouble();
        stokBuku = input.nextInt();
        rating = input.nextDouble();
        System.out.println(kodeISBN + "|" + judulBuku + "|" + namaPenulis + "|" + tahunTerbit + "|" + namaPenerbit + "|" + formatBuku + "|" + hargaPembelian + "|" + minimumMargin + "|" + stokBuku + "|" + rating);
    }
}
