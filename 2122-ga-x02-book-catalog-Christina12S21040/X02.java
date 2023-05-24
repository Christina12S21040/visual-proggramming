// 12S21033- Sry Deviani Tambunan
// 12S21040- Christina Putri Hutahaean
import java.util.*;
import java.lang.Math;

public class X02{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] kodeISBN = new String[5];
        double[] hargaBuku = new double[5];
        int[] jumlahBuku = new int[5];
        
        penginisiasianBuku(kodeISBN, hargaBuku, jumlahBuku);
        katalogBuku(kodeISBN, hargaBuku);
        pesananBuku(kodeISBN, jumlahBuku);
        System.out.println(output(jumlahBuku, hargaBuku));
    }
    
    public static void penginisiasianBuku(String[] kodeISBN, double[] hargaBuku, int[] jumlahBuku) {
        int y;
        
        for (y = 0; y <= 4; y++) {
            kodeISBN[y] = "";
            hargaBuku[y] = 0.0;
            jumlahBuku[y] = 0;
        }
    }
    
    public static void katalogBuku(String[] kodeISBN, double[] hargaBuku) {
        int y;
        
        for (y = 0; y <= 4; y++) {
            kodeISBN[y] = input.nextLine();
            hargaBuku[y] = Double.parseDouble(input.nextLine());
        }
    }
    
    public static void pesananBuku(String[] kodeISBN, int[] totalBuku) {
        String identifikasi;
        int y;
        
        y = 0;
        while (y < 5) {
            identifikasi = input.nextLine();
            if (identifikasi.equals("---")) {
                y = 5;
            } else {
                if (identifikasi.equals(kodeISBN[0])) {
                    y = 0;
                    totalBuku[y] = Integer.parseInt(input.nextLine());
                } else {
                    if (identifikasi.equals(kodeISBN[1])) {
                        y = 1;
                        totalBuku[y] = Integer.parseInt(input.nextLine());
                    } else {
                        if (identifikasi.equals(kodeISBN[2])) {
                            y = 2;
                            totalBuku[y] = Integer.parseInt(input.nextLine());
                        } else {
                            if (identifikasi.equals(kodeISBN[3])) {
                                y = 3;
                                totalBuku[y] = Integer.parseInt(input.nextLine());
                            } else {
                                if (identifikasi.equals(kodeISBN[4])) {
                                    y = 4;
                                    totalBuku[y] = Integer.parseInt(input.nextLine());
                                } else {
                                    y = 5;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static double output(int[] jumlahBuku, double[] hargaBuku) {
        int y;
        double totalKeseluruhan;
        
        totalKeseluruhan = 0.0;
        for (y = 0; y <= 4; y++) {
            totalKeseluruhan = hargaBuku[y] * jumlahBuku[y] + totalKeseluruhan;
        }
        
        return totalKeseluruhan;
    }
}
