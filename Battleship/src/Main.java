import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
				
		ArrayList<String> ship1 = new ArrayList<>();
		ArrayList<String> ship2 = new ArrayList<>();
		ArrayList<String> ship3 = new ArrayList<>();
		
		// TODO Auto-generated method stub
Automat automat  = new Automat();
Automat automat2  = new Automat();

	automat.Matrix();
	automat2.Matrix();
	automat.Ship(ship1);
	automat.Ship(ship2);
	automat.Ship(ship3);
	
	while(ship2.contains("chuj")==true) {
		ship2.clear();
		automat.Ship(ship2);
		System.out.println("Bang 1");
	}
	
	while(ship3.contains("chuj")==true) {
		ship3.clear();
		automat.Ship(ship3);
		System.out.println("Bang 2");
	}
	
	for(int j=0;j<7;j++) {
	System.out.println(automat.getMatrix().get(j));
	
		}	
	new MyFrame(automat,automat2);
	
	}
}

