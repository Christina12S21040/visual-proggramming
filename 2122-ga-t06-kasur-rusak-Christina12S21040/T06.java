// 12S21033 - Sry Deviani Tambunan
// 12S21040 - Christina Putri Hutahaean
import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String text;
        
        text = input.nextLine();
        System.out.println(palindrome(text));
    }
    
    public static String palindrome(String text) {
        int lengthText, n;
        String hasil;
        
        lengthText = text.length();
        lengthText = lengthText - 1;
        n = 0;
        if (String.valueOf(text.charAt(lengthText)).equals(String.valueOf(text.charAt(0)))) {
            hasil = palindrome2(text, n);
        } else {
            hasil = "BUKAN";
        }
        
        return hasil;
    }
    
    public static String palindrome2(String text, int n) {
        String hasilAkhir;
        int lengthText;
        
        lengthText = text.length();
        lengthText = lengthText - 1;
        hasilAkhir = "";
        if (String.valueOf(text.charAt(lengthText)).equals(String.valueOf(text.charAt(0)))) {
            if (lengthText - n == n) {
                hasilAkhir = "YA";
            } else {
                if (lengthText - n == n + 1) {
                    hasilAkhir = "YA";
                } else {
                    n = n + 1;
                    hasilAkhir = palindrome2(text, n);
                }
            }
        } else {
            hasilAkhir = "BUKAN";
        }
        
        return hasilAkhir;
    }
}
