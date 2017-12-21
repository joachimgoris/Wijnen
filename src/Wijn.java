import java.time.LocalDate;

public class Wijn {
	private String Naam;
	private String Omschrijving;
	private String Druivenras;
	private String Kleur;
	private String Land;
	private String Regio;
	private int Jaargang;
	private double Alcoholpercentage;
	private String Serveertip;
	
	public Wijn(String n, String k, String l) {
		this(n,l,k, LocalDate.now().getYear()-1,12.5);
	}
	
	public Wijn(String n, String l, String k, int j, double a) {
		setNaam(n);
		setLand(l);
		setKleur(k);
		setJaargang(j);
		setAlcoholpercentage(a);
	}

	public String getNaam() {
		return Naam;
	}

	public void setNaam(String naam) {
		Naam = naam;
	}

	public String getOmschrijving() {
		return Omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		Omschrijving = omschrijving;
	}

	public String getDruivenras() {
		return Druivenras;
	}

	public void setDruivenras(String druivenras) {
		Druivenras = druivenras;
	}

	public String getKleur() {
		return Kleur;
	}

	public void setKleur(String kleur) {
		switch(kleur) {
		case "Wit":
		case "Rood":
		case "Rosé":
			Kleur = kleur;
			break;
			default:
				Kleur = "Rood";
		}
	}

	public String getLand() {
		return Land;
	}

	public void setLand(String land) {
		switch(land) {
		case "Frankrijk":
		case "Chili":
		case"Italië":
		case"Spanje":
			Land = land;
		break;
		default:
			Land = "onbekend";
		}
	}

	public String getRegio() {
		return Regio;
	}

	public void setRegio(String regio) {
		Regio = regio;
	}

	public int getJaargang() {
		return Jaargang;
	}

	public void setJaargang(int jaargang) {
		if(jaargang<1950) 
			Jaargang = 1950;
		else {
			if(jaargang>LocalDate.now().getYear())
				Jaargang = LocalDate.now().getYear();
			else
				Jaargang = jaargang;
		}
	}

	public double getAlcoholpercentage() {
		return Alcoholpercentage;
	}

	public void setAlcoholpercentage(double alcoholpercentage) {
		if(alcoholpercentage<0)
			Alcoholpercentage = 0.0;
		else {
			if(alcoholpercentage>0.17)
				Alcoholpercentage = 0.17;
			else
				Alcoholpercentage = alcoholpercentage;
		}
	}

	public String getServeertip() {
		return Serveertip;
	}

	public void setServeertip(String serveertip) {
		Serveertip = serveertip;
	}
	
	public double getAdviesPrijs() {
		double prijs;
		int ouderdom;
		switch(getLand()) {
		case "Frankrijk":
			prijs = 7.5;
			break;
		case "Chili":
			prijs = 8.25;
			break;
		case "Italië":
			prijs = 9.30;
			break;
		case "Spanje":
			prijs = 6.45;
			break;
			default:
				prijs = 9.30;
		}
		if(Integer.toString(getJaargang()).substring(3)!="7")
			ouderdom = LocalDate.now().getYear() - getJaargang();
		else
			ouderdom = 0;
		prijs += 0.10*ouderdom;
		return prijs;
	}
	
	public String getLabel() {
		String retvalue = getNaam()+"\n"+getDruivenras()+"\n"+getRegio()+"\n"+getJaargang();
		return retvalue;
	}
	
	@Override
	public String toString() {
		return "Wijn [Naam=" + Naam + ", Omschrijving=" + Omschrijving + ", Druivenras=" + Druivenras + ", Kleur="
				+ Kleur + ", Land=" + Land + ", Regio=" + Regio + ", Jaargang=" + Jaargang + ", Alcoholpercentage="
				+ Alcoholpercentage + ", Serveertip=" + Serveertip + "]";
	}
}
