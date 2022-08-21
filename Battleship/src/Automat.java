import java.util.ArrayList;
import java.util.Random;

public class Automat {
	
	ArrayList<ArrayList<String>> matrix = new ArrayList<>();
	String [] x1 = {"A","B","C","D","E","F","G"};
	int x;
	int y;

	Random random = new Random();
	
	public void Matrix(){
				
	for(int j=0;j<7;j++) {
	matrix.add(new ArrayList<>());
	for(int i=0;i<7;i++) {
		matrix.get(j).add(x1[i]+(j+1));		
			}
		}
	}
	void Ship(ArrayList<String> ship) {
			
		boolean pozycja = random.nextBoolean();
		
		if (pozycja == true) {	//tu bêdzie wertykalny wzór
		x = (int)((Math.random()*6));	
		y = (int)((Math.random()*4));
		
		ship.add(matrix.get(y).get(x));
		ship.add(matrix.get(y+1).get(x));
		ship.add(matrix.get(y+2).get(x));
		
		if (ship.contains("chuj")==false) {
		matrix.get(y).set(x, "chuj");
		matrix.get(y+1).set(x, "chuj");
		matrix.get(y+2).set(x, "chuj");
			}
		}else { // a tutaj horyzontalny
			
			x = (int)((Math.random()*4));
			y = (int)((Math.random()*6));
			
			ship.add(matrix.get(y).get(x));
			ship.add(matrix.get(y).get(x+1));
			ship.add(matrix.get(y).get(x+2));
			
			if (ship.contains("chuj")==false) {
			matrix.get(y).set(x, "chuj");
			matrix.get(y).set(x+1, "chuj");
			matrix.get(y).set(x+2, "chuj");
			}
		}
	}

	public final ArrayList<ArrayList<String>> getMatrix() {
		return matrix;
	}
}

