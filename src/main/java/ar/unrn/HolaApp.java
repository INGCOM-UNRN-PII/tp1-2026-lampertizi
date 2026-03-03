package ar.unrn;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class HolaApp {
    public static void main(String[] args) {
        System.out.print("Ingresa un número, y probá otros valores: ");
        Scanner lector = new Scanner(System.in, StandardCharsets.UTF_8);
        int var = lector.nextInt();
        System.out.printf("Hola mundo '%d'!\n", var);
        lector.close();
    }

}
