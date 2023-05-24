// 12S21033 - Sry Deviani Tambunan
// 12S21040 - Christina Putri Hutahaean
import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] kodeISBN = new String[3];
        double[] hargaBuku = new double[3];
        int[] totalEksemplar = new int[3];
        double totalHargaAkhir;
        double[] totalHargaBuku = new double[3];
        double hargaBuku0, hargaBuku1, hargaBuku2;
        
        hargaBuku[0] = 0;
        hargaBuku[1] = 0;
        hargaBuku[2] = 0;
        int n;
        
        n = 0;
        totalEksemplar[0] = 0;
        totalEksemplar[1] = 0;
        totalEksemplar[2] = 0;
        int jumlahbook0, jumlahbook1, jumlahbook2;
        
        jumlahbook0 = 0;
        jumlahbook1 = 0;
        jumlahbook2 = 0;
        String iSBN0, iSBN1, iSBN2;
        
        iSBN0 = "Berhasil";
        iSBN1 = "Berhasil";
        iSBN2 = "Berhasil";
        int nol, sada, dua;
        
        nol = 0;
        sada = 1;
        dua = 2;
        while (n < 3) {
            kodeISBN[n] = input.nextLine();
            if (kodeISBN[n].equals("---")) {
                n = 3;
            } else {
                if (kodeISBN[n].equals(kodeISBN[0])) {
                    if (nol == 0) {
                        iSBN0 = kodeISBN[n];
                    }
                    if (kodeISBN[0].equals(iSBN0)) {
                        n = 0;
                        hargaBuku[n] = Double.parseDouble(input.nextLine());
                        totalEksemplar[n] = Integer.parseInt(input.nextLine());
                        jumlahbook0 = jumlahbook0 + totalEksemplar[n];
                        nol = 3;
                        n = n + 1;
                    } else {
                        if (sada == 1) {
                            iSBN1 = kodeISBN[n];
                        }
                        if (kodeISBN[0].equals(iSBN1)) {
                            n = 1;
                            hargaBuku[n] = Double.parseDouble(input.nextLine());
                            totalEksemplar[n] = Integer.parseInt(input.nextLine());
                            jumlahbook1 = jumlahbook1 + totalEksemplar[n];
                            nol = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            hargaBuku[n] = Double.parseDouble(input.nextLine());
                            totalEksemplar[n] = Integer.parseInt(input.nextLine());
                            jumlahbook2 = jumlahbook2 + totalEksemplar[n];
                            nol = 3;
                            n = 0;
                        }
                    }
                } else {
                    if (kodeISBN[n].equals(kodeISBN[1])) {
                        if (sada == 1) {
                            iSBN1 = kodeISBN[n];
                        }
                        if (kodeISBN[1].equals(iSBN1)) {
                            n = 1;
                            hargaBuku[n] = Double.parseDouble(input.nextLine());
                            totalEksemplar[n] = Integer.parseInt(input.nextLine());
                            jumlahbook1 = jumlahbook1 + totalEksemplar[n];
                            sada = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            hargaBuku[n] = Double.parseDouble(input.nextLine());
                            totalEksemplar[n] = Integer.parseInt(input.nextLine());
                            jumlahbook2 = jumlahbook2 + totalEksemplar[n];
                            sada = 3;
                            n = 0;
                        }
                    } else {
                        if (kodeISBN[n].equals(kodeISBN[2])) {
                            if (dua == 2) {
                                iSBN2 = kodeISBN[n];
                            }
                            if (kodeISBN[2].equals(iSBN2)) {
                                n = 2;
                                hargaBuku[n] = Double.parseDouble(input.nextLine());
                                totalEksemplar[n] = Integer.parseInt(input.nextLine());
                                jumlahbook2 = jumlahbook2 + totalEksemplar[n];
                                dua = 3;
                                n = 0;
                            }
                        }
                    }
                }
            }
        }
        
        // 0
        if (jumlahbook0 >= 20) {
            hargaBuku[0] = hargaBuku[0] - hargaBuku[0] * 12 / 100;
        } else {
            if (jumlahbook0 >= 10) {
                hargaBuku[0] = hargaBuku[0] - hargaBuku[0] * 5 / 100;
            } else {
                if (jumlahbook0 >= 5) {
                    hargaBuku[0] = hargaBuku[0] - hargaBuku[0] * 2 / 100;
                }
            }
        }
        totalHargaBuku[0] = hargaBuku[0] * jumlahbook0;
        if (jumlahbook1 >= 20) {
            hargaBuku[1] = hargaBuku[1] - hargaBuku[1] * 12 / 100;
        } else {
            if (jumlahbook1 >= 10) {
                hargaBuku[1] = hargaBuku[1] - hargaBuku[1] * 5 / 100;
            } else {
                if (jumlahbook1 >= 5) {
                    hargaBuku[1] = hargaBuku[1] - hargaBuku[1] * 2 / 100;
                }
            }
        }
        totalHargaBuku[1] = hargaBuku[1] * jumlahbook1;
        if (jumlahbook2 >= 20) {
            hargaBuku[2] = hargaBuku[2] - hargaBuku[2] * 12 / 100;
        } else {
            if (jumlahbook2 >= 10) {
                hargaBuku[2] = hargaBuku[2] - hargaBuku[2] * 5 / 100;
            } else {
                if (jumlahbook2 >= 5) {
                    hargaBuku[2] = hargaBuku[2] - hargaBuku[2] * 2 / 100;
                }
            }
        }
        totalHargaBuku[2] = hargaBuku[2] * jumlahbook2;
        totalHargaAkhir = totalHargaBuku[0] + totalHargaBuku[1] + totalHargaBuku[2];
        System.out.println(toFixed(totalHargaAkhir,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
