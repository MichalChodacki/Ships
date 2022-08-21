import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyFrame extends JFrame {
	
	int x=0;
	int y=0;

Automat matrix;
Automat matrix2;
Timer timer;
ArrayList<ArrayList<Button>> boa = new ArrayList<>();
ArrayList<ArrayList<Button>> pyton = new ArrayList<>();
HashSet<String> ship = new HashSet<>();
Enemy enemy;
Matrix matrix3 = new Matrix();
ActionListener kokos;
ActionListener banan;

//ArrayList<String> flota = new ArrayList<>();

	MyFrame (Automat matrix,Automat matrix2) {
			
		this.setTitle("Statki");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(920, 550);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.blue);
		panel.setBounds(50, 100, 350, 350);
		panel.setVisible(true);
		this.add(panel);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.yellow);
		panel2.setBounds(500, 100, 350, 350);
		panel2.setVisible(true);
		this.add(panel2);
		
		
		JLabel box1 = new JLabel();
		box1 = new JLabel();
		box1.setText("<html>"
	            + "<p><font size=+2>Enemy</p>");
		box1.setFont(new Font("Chuj",Font.ITALIC,20));
		box1.setBackground(Color.DARK_GRAY);
		box1.setOpaque(true);
		box1.setForeground(new Color(0x000000));
		box1.setVisible(true);
		box1.setBounds(201,2,99,46);
		this.add(box1);
		
		JLabel box2 = new JLabel();
		box2 = new JLabel();
		box2.setText("<html>"
	            + "<p><font size=+2>Player</p>");
		box2.setFont(new Font("Chuj",Font.ITALIC,20));
		box2.setBackground(Color.darkGray);
		box2.setForeground(new Color(0x000000));
		box2.setVisible(true);
		box2.setBounds(601,2,99,46);
		box2.setOpaque(true);
		this.add(box2);
		this.add(new BackPanel());
		this.repaint();
	//	this.pack();
		
		for (x=0; x<7;x++) {
			boa.add(new ArrayList<>());
			pyton.add(new ArrayList<>());
			for (y=0;y<7;y++) {
	
			boa.get(x).add(new Button(x, y, matrix));
			pyton.get(x).add(new Button(x, y, matrix2));
			boa.get(x).get(y).getButton().setEnabled(false);
			boa.get(x).get(y).getButton().setBackground(Color.blue);
			kokos = new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent yx) {
					// TODO Auto-generated method stub
					for (int i=0; i<7;i++) {
						for (int j=0; j<7;j++) {
						
					if(yx.getSource()==boa.get(i).get(j).getButton()){
						
						System.out.println(boa.get(i).get(j).getButton().getName());
						if(boa.get(i).get(j).getButton().getName()=="chuj") {
						boa.get(i).get(j).getButton().setBackground(Color.RED);
						}
						if(!(boa.get(i).get(j).getButton().getName()=="chuj")) {
							boa.get(i).get(j).getButton().setBackground(Color.gray);
						}
						boa.get(i).get(j).getButton().setEnabled(false);
						}
					}
				}
				
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//timer = new Timer (3000, this);
					//timer.start();
					enemy = new Enemy(matrix3);
				//	System.out.println(enemy.shot);
					//System.out.println(enemy.getX()+" "+enemy.getY());
					
					if(ship.contains(enemy.shot)==true) {
						//System.out.println(true);
						pyton.get(enemy.getX()).get(enemy.getY()).getButton().setBackground(Color.red);
						}
					if(ship.contains(enemy.shot)==false) {
						//System.out.println(false);
						pyton.get(enemy.getX()).get(enemy.getY()).getButton().setBackground(Color.gray);
						}
					
			}	
		};
			
			banan = new ActionListener() {
		 
				@Override
				public void actionPerformed(ActionEvent xy) {
					for (int i=0; i<7;i++) {
						for (int j=0; j<7;j++) {
							
							
					if(ship.size()<9) {
					if(xy.getSource()==pyton.get(i).get(j).getButton()) {
						ship.add(pyton.get(i).get(j).getButton().getName());	
						
				//	System.out.print(i+1+" "+(j+1));
					//System.out.println("");
					pyton.get(i).get(j).getButton().setBackground(Color.magenta);
					//System.out.println(pyton.get(i).get(j).getButton().getName());
							}
						}
					if (ship.size()>=9) {
					for (int k=0; k<7;k++) {
						for (int l=0; l<7;l++) {
					pyton.get(k).get(l).getButton().setEnabled(false);
					boa.get(k).get(l).getButton().setEnabled(true);

					pyton.get(k).get(l).getButton().setBackground(Color.blue);
					boa.get(k).get(l).getButton().setBackground(Color.CYAN);

						}}				
							}
						}
					}
				}
			};
			boa.get(x).get(y).getButton().addActionListener(kokos);
			pyton.get(x).get(y).getButton().addActionListener(banan);
			
			panel.add(boa.get(x).get(y).getButton());
			panel2.add(pyton.get(x).get(y).getButton());
			
			
				}	
		}
		
		this.repaint();	
	}
		
	public void rysuj(Graphics g) {
		//super.rysuj(g);
	Graphics2D g2 = (Graphics2D) g;
	for(int i=0;i<450/50;i++) {
			g2.setPaint(Color.white);
			g2.drawLine(i*50, 0, i*50, 450);
			g2.drawLine(0, i*50, 850, i*50);
			
		}
	this.repaint();
	}
	
}
