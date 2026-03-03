package cartes;

public class Borne extends Carte {
	private int km;
	public Borne(int km) {
		this.setKm(km);
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	
	@Override
	public String toString() {
		return km + "KM";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			//this renvoi la classe si borne est compare a borne
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Borne autre = (Borne) obj;
		return km == autre.km;
	}
}
