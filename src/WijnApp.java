import java.util.ArrayList;

public class WijnApp {

	public static void main(String[] args) {
		Wijn w1 = new Wijn("Parra","Wit","Spanje");
		Wijn w2 = new Wijn("Domaine de la Jardine","Rood","Frankrijk");
		Wijn w3 = new Wijn("Montebello Grande Bellezza","Rood","Italië");
		Wijn w4 = new Wijn("Château Palmer 3eme Grand Cru","Rood","Frankrijk");
		
		w1.setOmschrijving("Licht, fri en strak");
		w2.setOmschrijving("Licht, soepel en fruitig");
		w3.setOmschrijving("Licht, soepel en fruitig");
		w4.setOmschrijving("Complex, krachtig en vol");
		
		w1.setDruivenras("Sauvignon Blanc");
		w2.setDruivenras("Merlot");
		w3.setDruivenras("Negroamaro");
		w4.setDruivenras("Merlot");
		
		w1.setRegio("La Mancha");
		w2.setRegio("Pays d'Oc");
		w3.setRegio("Puglia");
		w4.setRegio("Bordeaux");
		
		w1.setJaargang(2016);
		w2.setJaargang(2016);
		w3.setJaargang(2016);
		w4.setJaargang(2002);
		
		w1.setAlcoholpercentage(0.115);
		w2.setAlcoholpercentage(0.14);
		w3.setAlcoholpercentage(0.13);
		w4.setAlcoholpercentage(0.135);
		
		w1.setServeertip("Visgerechten");
		w2.setServeertip("Gevogelte");
		w3.setServeertip("Gegrild vlees");
		w4.setServeertip("");
		
		ArrayList<Wijn> arr = new ArrayList<Wijn>();
		
		arr.add(w1);
		arr.add(w2);
		arr.add(w3);
		arr.add(w4);
		
		Wijn duurst = arr.get(0);
		Wijn goedkoopst = arr.get(0);
		int aantalRoodWijn = 0;
		
		for(Wijn w:arr) {
			if(w.getKleur().equals("Rood"))
				aantalRoodWijn++;
			if(w.getAdviesPrijs()>duurst.getAdviesPrijs())
				duurst = w;
			if(w.getAdviesPrijs()<goedkoopst.getAdviesPrijs())
				goedkoopst = w;
		}
		
		System.out.println("duurste wijn: "+duurst.getLabel());
		System.out.println("goedkoopste wijn: "+goedkoopst.getLabel());
		System.out.println("Aantal rode wijnen: "+aantalRoodWijn);
		
		System.out.println("Past bij gevogelte:");
		for(Wijn w:arr) {
			if(w.getServeertip().equals("Gevogelte"))
				System.out.println(w.getLabel());
		}
		
		
	}

}
