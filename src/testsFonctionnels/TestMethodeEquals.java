package testsFonctionnels;

import cartes.Attaque;
import cartes.Borne;
import cartes.Parade;
import cartes.Type;

public class TestMethodeEquals {

	public static void main(String[] args) {
		Borne b1 = new Borne(25);
		Borne b2 = new Borne(25);
		Attaque feu1 = new Attaque(Type.FEU);
		Attaque feu2 = new Attaque(Type.FEU);
		Parade feuV = new Parade(Type.FEU);
		
		System.out.println("Deux cartes de 25km sont identiques ? " + b1.equals(b2));
        System.out.println("Deux cartes de feux rouge sont identiques ? " + feu1.equals(feu2));
        System.out.println("La carte feu rouge et la carte feu vert sont identiques ? " + feu1.equals(feuV));	
	}
}
