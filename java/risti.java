/*Laadi appletti, joka piirtää lipun, jossa on risti keskellä. Voit valita mitat 
ja värittää ristin sekä taustan haluamallasi värillä. Laadi myös html-sivu, joka 
sisältää appletin. Kun html-sivun lataa selaimeen, se piirtää lipun heti näkyviin.*/

import java.applet.*;
import java.awt.* ;

public class risti extends Applet 
{

	int leveys, korkeus;
	
	public void init() 
	{
		leveys = getSize().width;
		korkeus = getSize().height;
		setBackground(Color.black);
	}
	
	public void paint (Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillRect(0,100,400,65);
		g.fillRect(100,0,65,300);
	}
}