// 12S21040 - Christina Putri Hutahaean

import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        
        x = input.nextInt();
        int y;
        
        y = input.nextInt();
        int z;
        
        z = input.nextInt();
        int s;
        
        if (x < y) {
            s = x;
        } else {
            s = y;
        }
        if (z < s) {
            s = z;
        }
        System.out.println(s);
    }
}
