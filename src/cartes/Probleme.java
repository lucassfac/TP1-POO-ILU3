package cartes;

public abstract class Probleme extends Carte {
	private Type type;
	public Probleme(Type type) {
		this.setType(type);
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Probleme autre = (Probleme) obj;
		return getType().equals(autre.getType());
	}
}
