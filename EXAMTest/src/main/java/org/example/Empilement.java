package org.example;

import java.util.ArrayDeque;

public class Empilement {
    public   ArrayDeque<Bloc> pile= new ArrayDeque<>();

    public Empilement() {
        pile = new ArrayDeque<>();
    }

    public int getHauteur() {

        int cpt=0;
        for (Bloc p : pile){
            cpt=cpt+p.getHauteur();
        }
        return cpt;
    }


    public void ajoute(Bloc b) throws EmpilementImpossibleException {

        if (!b.estEmpilable()) {
            throw new EmpilementImpossibleException("Bloc non empilable !");
        }
        pile.add(b);
    }

    public boolean rechercher(Bloc b) {
        return pile.contains(b);
    }


    public Bloc retire() throws ArrayDequeException {
        if (pile.isEmpty()) {
            throw new ArrayDequeException("Empilement vide !");
        }
        return pile.remove();
    }
}

