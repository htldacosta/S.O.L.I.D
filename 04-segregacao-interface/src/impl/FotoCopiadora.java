package impl;

import interfaces.Impressora;
import interfaces.Scanner;


public class Fotocopiadora implements Impressora, Scanner {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando...");
    }
}
