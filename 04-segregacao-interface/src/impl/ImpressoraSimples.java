package impl;

import interfaces.Impressora;

public class ImpressoraSimples implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo documento...");
    }
}
