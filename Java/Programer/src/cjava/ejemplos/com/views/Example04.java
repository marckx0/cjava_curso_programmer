package cjava.ejemplos.com.views;

import javax.swing.*;

public class Example04 {
    public static void main(String[] args) {
        int n =784125;
        int cifra;
        while(n>0){
            cifra = n % 10;
            System.out.println(" cifra " + cifra);
            n = n/10;
        }

        String sOption;
        int conta = 0;
        do{
            sOption = JOptionPane.showInputDialog("Ingrese opcion: \nA\nB\nC");
            if (sOption.equalsIgnoreCase("A"))conta++;
        } while (!sOption.equalsIgnoreCase("C"));
        System.out.println("Contador de A: "+conta);
    }
}
