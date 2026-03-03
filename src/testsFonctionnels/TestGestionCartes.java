package testsFonctionnels;

import java.util.*;
import cartes.*;
import utils.GestionCartes;

public class TestGestionCartes {
	
	public static void main(String[] args) {
		JeuDeCartes jeu = new JeuDeCartes();
		List<Carte> listeCarteNonMelange = new LinkedList<>();
		
		for (Carte carte : jeu.donnerCartes()) {
			listeCarteNonMelange.add(carte);
		}
		
		List<Carte> listeCartes = new ArrayList<>(listeCarteNonMelange);
		System.out.println(listeCartes);
		
		listeCartes = GestionCartes.melanger(listeCartes);
		System.out.println(listeCartes);
		
		System.out.println("liste mélangée sans erreur ? " 
	            + GestionCartes.verifierMelange(listeCarteNonMelange, listeCartes));
		
		listeCartes = GestionCartes.rassembler(listeCartes);
		System.out.println(listeCartes);
		
		System.out.println("liste rassemblée sans erreur ? " 
	            + GestionCartes.verifierRassemblement(listeCartes));
		
	}
}
