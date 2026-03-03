package jeu;

import java.util.*;
import cartes.*;
import utils.GestionCartes;

public class Jeu {
	private Sabot sabot;
	
	public Jeu() {
		JeuDeCartes jeuDeCarte = new JeuDeCartes();
		Carte[] tabCartes = jeuDeCarte.donnerCartes();
		
		List<Carte> listeCartes = new ArrayList<>();
		Collections.addAll(listeCartes, tabCartes);
		
		listeCartes = GestionCartes.melanger(listeCartes);
		
		Carte[] tabCartesMelange = listeCartes.toArray(new Carte[0]);
		
		this.sabot = new Sabot(tabCartesMelange);
	}
	
	public Sabot getSabot() {
		return sabot;
	}
	
	
	public static void main(String[] args) {
		Jeu monJeu = new Jeu();
		System.out.println("Le sabot est rempli !");
		
		Carte c = monJeu.getSabot().piocher();
		System.out.println("Premiere caret piochee : " + c);
	}
}
