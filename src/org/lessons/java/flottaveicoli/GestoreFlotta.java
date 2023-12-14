package org.lessons.java.flottaveicoli;

import java.util.ArrayList;
import java.util.List;

public class GestoreFlotta {
    private List<Veicolo> veicoli;

    public GestoreFlotta(){
        veicoli = new ArrayList<>();
    }

    public void insVeicolo(Veicolo veicolo){
    if(!veicoli.contains(veicolo)){
        veicoli.add(veicolo);
    } else {
        System.out.println("Non puoi aggiungere questo veicolo con questa targa: " + veicolo.getTarga() + ". Esiste già!");
    }

    }
    public int contaVeicoliDiTipo(Class<? extends Veicolo> tipo) {
        int contatore = 0;
        for (Veicolo veicolo : veicoli) {
            if (tipo.isInstance(veicolo)) {
                contatore++;
            }
        }
        return contatore;
    }
    public Veicolo trovaTargaVeicolo(String targa){
        Veicolo found = null;
        for (Veicolo veic: veicoli) {
            if (veic.getTarga().equals(targa)){
                found = veic;
            }
        }
        return found;
    }


}
