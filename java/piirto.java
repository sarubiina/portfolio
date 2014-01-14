/*Laadi appletti, joka toimii seuraavasti. Kun klikkaat hiirellä johonkin kohti 
appletin alueella, piirtää appletti kyseiseen kohti 20 pikselin suuruisen neliön, 
joka on halutunvärinen. Värin käyttäjä valitsee painamalla hiiren klikkaamisen 
jälkeen jotain seuraavista painikkeista: s=sininen, p=punainen, k=keltainen tai 
v=vihreä. Piirtäminen tapahtuu, kun käyttäjä on valinnut hiirellä kohdan ja 
näppäimellä värin.*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Point;
import javax.swing.*;

public class piirto extends Applet 
	implements KeyListener, MouseListener
{
	int leveys, korkeus;
	Color color;
	int x, y;
	
	public void init() 
	{
		leveys = getSize().width;
		korkeus = getSize().height;
		setBackground(Color.gray);
		//kuuntelijat hiirtä ja näppäimistöä varten
		addMouseListener(this);
		addKeyListener(this);
	}
	//hiiri
	public void mousePressed(MouseEvent e)
	{
		requestFocus();
		//Graphics g = getGraphics();
		//int radius = 20;
		x = e.getX();
		y = e.getY();
		//g.setColor(color);
		//g.fillRect(e.getX()-radius,e.getY()-radius, radius, radius);
	}
	//käyttäjän painaman napin kutsuminen
	public void keyTyped(KeyEvent e)
	{
		//Graphics g = getGraphics();
		//haetaan painike mitä on painettu
		char ch = e.getKeyChar();  // The character typed.
         
         if (ch == 'S' || ch == 's') {
            color = Color.BLUE;
            repaint();   // Redraw panel with new color.
         }
         else if (ch == 'V' || ch == 'v') {
            color = Color.GREEN;
            repaint();
         }
         else if (ch == 'P' || ch == 'p') {
            color = Color.RED;
            repaint();
         }
         else if (ch == 'K' || ch == 'k') {
            color = Color.YELLOW;
            repaint();
         }
		/*int key = e.getKeyCode();
		if (key == KeyEvent.VK_K)
		{
			color = Color.YELLOW;
			repaint();
		}
		if (key == KeyEvent.VK_P)
		{
			color = Color.red;
			repaint();
		}*/
	}
	//piirtäminen
	public void paint (Graphics g)
	{
			//väri millä maalataan
			g.setColor(color);
			//ruutu joka piirtyy
			g.fillRect(x-20,y-20, 20,20);
	}
//näppäimistö
///////////////////////////////////
	public void keyPressed(KeyEvent e){}
	public void keyReleased(KeyEvent e){}
///////////////////////////////////
//hiiri
///////////////////////////////////
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseClicked(MouseEvent e){}
///////////////////////////////////
	
}