/*Toteuta sopivaksi katsomasi luokkahierarkia seuraavan kuvauksen pohjalta 
(hyödynnä periytymistä):
1.Eläimellä on nimi ja se voi olla elossa tai kuollut. Eläimelle voi antaa nimen, 
jonka käyttäjä voi myös selvittää/tulostaa. Käyttäjä voi myös selvittää, onko 
eläin elossa vai kuollut, sekä asettaa eläimen tilan kuolleeksi.
5.Laadi lisäksi pääohjelma, jossa testaat luomiesi luokkien toiminnallisuuden.*/

import java.util.*;
//toteutettava luokka
public class miniprojekti7 {
//eläinluokka
public static class Elain {
	//eläin attribuutit
	protected String nimi;
	protected boolean elossa = true;
	protected String totta;
	
	public Elain(String name, boolean alive)
	{
		//nimi
		nimi = name;
		//elossa
		elossa = alive;
	}
	//getterit
	public String getNimi() {return nimi;}
	public boolean getElossa() { return elossa;}
	//setterit
	public void setNimi(String uusinimi)
	{
		nimi = uusinimi;
	}
	public void setElossa (boolean uusielossa)
	{
		elossa = uusielossa;
	}
	//annetaan nimi
	public void MuutaNimi()
	{
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		//tiedot käyttäjältä
		//nimi
		System.out.println("Anna eläimen nimi: ");
		nimi = lukija.nextLine();
		setNimi(nimi);
	}
	//muutetaan elossa
	public void OnkoElossa()
	{
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		System.out.println("onko eläin elossa?: ");
		totta = lukija.nextLine();
		if (totta == "kyllä")
		{
			elossa = true;
		}
		else
		{
			elossa = false;
		}
	}
}
////////////////////////////////////////////////////////////////////
/*2.Kissa perii eläimen ominaisuudet. Lisäksi sillä on useita elämiä, jotka käyttäjä 
voi asettaa. Käyttäjä voi myös vähentää kissan elämiä, sekä selvittää niiden lukumäärän.*/
//kissa
public static class Kissa extends Elain {
	//kissan attribuutti
	private int elama;
	
	public Kissa (String name, boolean alive, int life)
	{
		super(name,alive);
		elama = life;
	}
	//getteri
	public int getElama() {return elama;}
	//setteri
	public void setElama(int uusielama)
	{
		elama = uusielama;
	}
	public void MuutaElama()
	{
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		//elämät
		System.out.println("kuinka monta elämää kissalla on?: ");
		elama = lukija.nextInt();
		setElama(elama);
	}
	//elämän lisääminen
	public void LisaaElama(int lisaa)
	{
		elama += lisaa;
	}
	//elämän vähentäminen
	public void VahennaElama(int vahenna)
	{
		elama -= vahenna;
	}
	//elämän tulostus
	public void TulostaElama()
	{
		if (elama > 0)
		{
			System.out.println("kissalla on " + getElama() + " elämää");
		}
		else 
		{
			System.out.println("kissa on kuollut");
			//haluaisin että tämä muuttaa kissan kuolleeksi, mutta se ei sitä tee...
			elossa = false;
		}
	}
	//tulosta kissa
	public void TulostaKissa()
	{
		System.out.println("kissan nimi: " + getNimi());
		System.out.println("Kissa on hengissä : " + getElossa());
		System.out.println("kissalla on " + getElama() + " elämää"); 
	}
}
////////////////////////////////////////////////////////////////////
/*3.Myös papukaija perii eläimen ominaisuudet. Lisäksi sillä on merirosvoisäntä, 
jonka käyttäjä voi asettaa. Käyttäjä voi myös selvittää merirosvoisännän nimen.*/
//papukaija
public static class Papukaija extends Elain{
	//papukaijan attribuutti
	private String merirosvo;
	
	public Papukaija ( String name, boolean alive, String pirate)
	{
		super(name,alive);
		pirate = merirosvo;
	}
	//getteri
	public String getMerirosvo() { return merirosvo;}
	//setteri
	public void setMerirosvo(String uusimerirosvo)
	{
		merirosvo = uusimerirosvo;
	}
	//nimen tulostus
	public void MuutaMerirosvo()
	{
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		//merirosvo
		System.out.println("kerro papukaijan merirosvoisännän nimi: ");
		merirosvo = lukija.nextLine();
		setMerirosvo(merirosvo);
	}
	//tulosta papukaija
	public void TulostaPapukaija()
	{
		System.out.println("papukaijan nimi: " + getNimi());
		System.out.println("Papukaija on hengissä : " + getElossa());
		System.out.println("merirosvon nimi on: " + getMerirosvo());
	}
}
////////////////////////////////////////////////////////////////////
/*4.Myös lammas perii eläimen ominaisuudet. Lisäksi se voi olla joko valkoinen 
tai musta lammas. Oletuksena lammas on valkoinen mutta käyttäjä voi muuttaa 
lampaan mustaksi ja takaisin valkoiseksi. Käyttäjä voi myös selvittää lampaan värin.*/
//lammas
public static class Lammas extends Elain{
	//attribuutti
	private boolean vari;
	private String valkoinen;
	
	Lammas(String name, boolean alive, boolean color)
	{
		super(name,alive);
		vari = color;
	}
	//getteri
	public boolean getVari() {return vari;}
	//setteri
	public void setVari(boolean uusivari)
	{
		vari = uusivari;
	}
	//muuta väri
	public void MuutaVari()
	{
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		System.out.println("onko lammas musta vai valkoinen?: ");
		valkoinen = lukija.nextLine();
		if (valkoinen == "valkoinen")
		{
			vari = true;
		}
		else
		{
			vari = false;
		}
	}
	//tulosta lammas
	public void TulostaLammas()
	{
		System.out.println("lampaan nimi: " + getNimi());
		System.out.println("lammas on hengissä : " + getElossa());
		System.out.println("lammas on valkoinen: " + getVari());
	}
}
////////////////////////////////////////////////////////////////////
//pääohjelma
	public static void main(String[] args)
	{
		int valinta;
		int muutos;
		//lukija
		Scanner lukija;
		lukija = new Scanner(System.in);
		//käyttäjä valitsee eläimen
		System.out.println("onko eläimesi kissa(1), papukaija(2), lammas(3)?");
		valinta = lukija.nextInt();
		//jos yksi niin kissa
		if (valinta == 1)
		{
			Kissa kissa = new Kissa("nauku",true,9);
			kissa.TulostaKissa();
			System.out.println("\nmuuta kissan nimi(1),onko kissa elossa(2), aseta elämä(3), lisää elämää(4), vähennä elämää(5), katsoa elämän määrä(6), lue kissan tiedot(7)?");
			do {
			muutos = lukija.nextInt();
			switch(muutos) {
				case 1: kissa.MuutaNimi();
					break;
				case 2: kissa.OnkoElossa();
					break;
				case 3: kissa.MuutaElama();
					break;
				case 4: kissa.LisaaElama(1);
					break;
				case 5: kissa.VahennaElama(1);
					break;
				case 6: kissa.TulostaElama();
					break;
				case 7: kissa.TulostaKissa();
					break;
				}
			} while (muutos != 0);
			}
		
		//jos kaksi niin papukaija
		if (valinta == 2)
		{
			Papukaija papukaija = new Papukaija("kaija",true,"kapteenikoukku");
			papukaija.TulostaPapukaija();
			System.out.println("\nmuuta nimi(1),onko elossa(2), muuta merirosvon nimi(3), lue papukaijan tiedot(4)?");
			do {
			muutos = lukija.nextInt();
			switch(muutos) {
				case 1: papukaija.MuutaNimi();
					break;
				case 2: papukaija.OnkoElossa();
					break;
				case 3: papukaija.MuutaMerirosvo();
					break;
				case 4: papukaija.TulostaPapukaija();
					break;
				}
			} while (muutos != 0);
		}
		//jos kolme niin lammas
		if (valinta == 3)
		{
			Lammas lammas = new Lammas("baa",true,true);
			lammas.TulostaLammas();
			System.out.println("\nmuuta nimi(1),onko elossa(2), muuta lampaan väri(3), lue lampaan tiedot(4)?");
			do {
			muutos = lukija.nextInt();
			switch(muutos) {
				case 1: lammas.MuutaNimi();
					break;
				case 2: lammas.OnkoElossa();
					break;
				case 3: lammas.MuutaVari();
					break;
				case 4: lammas.TulostaLammas();
					break;
				}
			} while (muutos != 0);
		}
	}
}