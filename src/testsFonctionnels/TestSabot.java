package testsFonctionnels;

import java.util.Iterator;
import cartes.Botte;
import cartes.Carte;
import cartes.JeuDeCartes;
import cartes.Type;
import jeu.Sabot;

public class TestSabot {
    JeuDeCartes jeu = new JeuDeCartes();
    
    // 2.a : Utilisation de la méthode piocher()
    public void questionA() {
        System.out.println("--- TEST QUESTION A ---");
        Sabot sabot = new Sabot(jeu.donnerCartes());
        while (!sabot.estVide()) {
            Carte carte = sabot.piocher();
            System.out.println("Je pioche " + carte);
        }
    }

    // 2.b : Utilisation de l'itérateur et de remove()
    public void questionB() {
        System.out.println("\n--- TEST QUESTION B ---");
        Sabot sabot = new Sabot(jeu.donnerCartes());
        for (Iterator<Carte> iterator = sabot.iterator(); iterator.hasNext();) {
            System.out.println("Je pioche " + iterator.next());
            iterator.remove();
        }
    }

    // 2.c : Vérification de la levée d'exception (ConcurrentModificationException)
    public void questionC() {
        System.out.println("\n--- TEST QUESTION C ---");
        Sabot sabot = new Sabot(jeu.donnerCartes());
        
        // On pioche une carte avant la boucle pour éviter le débordement de capacité
        // quand on fera le ajouterCarte juste après.
        Carte cartePiochee = sabot.piocher(); 
        System.out.println("Je pioche d'abord : " + cartePiochee);
        
        try {
            for (Iterator<Carte> iterator = sabot.iterator(); iterator.hasNext();) {
                Carte carte = iterator.next();
                System.out.println("Itérateur voit : " + carte);
                iterator.remove();
                
                // DÉCLENCHEUR D'EXCEPTION 1 : on pioche "en douce" sans prévenir l'itérateur
                // sabot.piocher(); 
                
                // DÉCLENCHEUR D'EXCEPTION 2 : on ajoute une carte "en douce"
                sabot.ajouterCarte(new Botte(Type.ACCIDENT)); // As du volant
            }
        } catch (Exception e) {
            System.out.println("Succès du test C : Une exception a bien été levée -> " + e.toString());
        }
    }

    public static void main(String[] args) {
        TestSabot testPioche = new TestSabot();
        
        testPioche.questionB();
    }
}