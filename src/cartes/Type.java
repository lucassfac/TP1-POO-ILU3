package cartes;

public enum Type {
	FEU("Feu Rouge","Feu Vert","Prioritaire"),
	ESSENCE("Bideon d'essence","Panne d'essence","Citerne"),
	CREVAISON("Roue de secours","Crevaison","Increvable"),
	ACCIDENT("Réparation","Accident","As du volant");
	
	private final String nomAttaque;
	private final String nomParade;
	private final String nomBotte;
	
	Type(String nomAttaque, String nomParade, String nomBotte){
		this.nomAttaque = nomAttaque;
		this.nomParade = nomParade;
		this.nomBotte = nomBotte;
	}

	public String getNomAttaque() {
		return nomAttaque;
	}

	public String getNomParade() {
		return nomParade;
	}

	public String getNomBotte() {
		return nomBotte;
	}
	
}
