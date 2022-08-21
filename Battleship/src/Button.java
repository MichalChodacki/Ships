import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Button {
	
	int x;
	int y;
	Automat matrix;
	JButton button;

	Button(int x,int y, Automat matrix) {	
		button = new JButton();
	button.setName(matrix.getMatrix().get(y).get(x));
	button.setBounds(x*50,y*50,50,50);
	button.setFocusable(false);
	button.setBackground(Color.CYAN );
	button.setBorder(BorderFactory.createEtchedBorder());
	//button.addActionListener(this);
	//e -> System.out.println(button.getName())
	
	}
	
	/*public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button){
			
			System.out.println(button.getName());
			if(button.getName()=="chuj") {
			button.setBackground(Color.RED);
			}
			if(!(button.getName()=="chuj")) {
				button.setBackground(Color.gray);
			}
			button.setEnabled(false);
		}	
	}*/
	public final JButton getButton() {
		return button;
	}
}


			
		
		 
	
	



