package cartes;

public class JeuDeCartes {
	private Configuration[] typeDeCartes = new Configuration[] {
			new Configuration(new Borne(25), 10),
			new Configuration(new Borne(50), 10),
			new Configuration(Attaque(Type.FEU), 14),
			
			
	};
	
	private class Configuration{
		private Carte carte;
		private int nbExemplaires;
		public Configuration(Carte carte, int nbExemplaires) {
			this.carte = carte;
			this.nbExemplaires = nbExemplaires;
		}
		public Carte getCarte() {
			return carte;
		}
		public int getNbExemplaires() {
			return nbExemplaires;
		}
	}
	
	
}
