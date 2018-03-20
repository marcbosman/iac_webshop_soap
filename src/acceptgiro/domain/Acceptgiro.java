package acceptgiro.domain;

public class Acceptgiro {
	private int Id;
	private String Klantnaam;
	private String Klantadres;
	private double Bedrag;
	private int Uniek_getal;
	
	public Acceptgiro(int Id, String Klantnaam, String Klantadres, double Bedrag, int Uniek_getal) {
		this.Id = Id;
		this.Klantnaam = Klantnaam;
		this.Klantadres = Klantadres;
		this.Bedrag = Bedrag;
		this.Uniek_getal = Uniek_getal;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getKlantnaam() {
		return Klantnaam;
	}

	public void setKlantnaam(String klantnaam) {
		Klantnaam = klantnaam;
	}

	public String getKlantadres() {
		return Klantadres;
	}

	public void setKlantadres(String klantadres) {
		Klantadres = klantadres;
	}

	public double getBedrag() {
		return Bedrag;
	}

	public void setBedrag(double bedrag) {
		Bedrag = bedrag;
	}

	public int getUniek_getal() {
		return Uniek_getal;
	}

	public void setUniek_getal(int uniek_getal) {
		Uniek_getal = uniek_getal;
	}
	
}