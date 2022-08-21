import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class BackPanel extends JPanel{
	
String[] abc = {"A", "B", "C", "D" ,"E", "F", "G"};

	 BackPanel() {
		//this.setPreferredSize(new Dimension(850,550));
		this.setBounds(0, 0, 850, 450);
		this.setVisible(true);
		this.setBackground(Color.gray);
		//this.setLayout(null);
	}
	public void paint(Graphics g) {
		//super.rysuj(g);
		//g.drawLine(0, 50, 350, 450);
	Graphics2D g2 = (Graphics2D) g;
	for(int i=1;i<900/50;i++) {
			g2.setPaint(Color.ORANGE);
			g2.setStroke(new BasicStroke(3));
			g2.drawLine(i*50, 50, i*50, 450);
			g2.drawLine(0, i*50, 900, i*50);		
	
		}
	g2.setPaint(Color.black);
	g2.setFont(new Font("dupa",Font.BOLD,50));
	for(int i=0;i<7;i++) {
		String chuj = String.valueOf(i+1);
	g2.drawString(chuj, 8, i*50+145);
	g2.drawString(chuj, 458, i*50+145);
	g2.drawString(abc[i], 58+i*50, 95);
	g2.drawString(abc[i], 508+i*50, 95);
	}
	//g2.drawLine(0, 0, 850, 550);
	}
}
