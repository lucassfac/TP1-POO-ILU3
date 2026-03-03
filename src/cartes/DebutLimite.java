package cartes;

public class DebutLimite extends Limite {
	@Override
	public String toString() {
		return "Limite 50";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		return obj != null && getClass() == obj.getClass();
	}
}
