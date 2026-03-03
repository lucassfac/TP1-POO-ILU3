package cartes;

public class FinLimite extends Limite {
	
	@Override
	public String toString() {
		return "Fin de limite";
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		return obj != null && getClass() == obj.getClass();
	}
}
