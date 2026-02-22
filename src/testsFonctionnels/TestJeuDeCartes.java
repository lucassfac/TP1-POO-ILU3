package testsFonctionnels;

import cartes.JeuDeCartes;

public class TestJeuDeCartes {
    public static void main(String[] args) {
        JeuDeCartes jeu = new JeuDeCartes();
        
        System.out.println("JEU:\n" + jeu.affichageJeuCartes());
        
        if (!jeu.checkCount()) {
            System.out.println("Erreur : le nombre total de cartes n'est pas correct.");
        } else {
            System.out.println("Le jeu contient bien 106 cartes.");
        }
    }
}