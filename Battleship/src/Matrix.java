import java.util.ArrayList;

public class Matrix {
	String [] x = {"A","B","C","D","E","F","G"};
	ArrayList<ArrayList<String>> matrix = new ArrayList<>();
	public Matrix(){
	
	for(int j=0;j<7;j++) {
	matrix.add(new ArrayList<>());
	for(int i=0;i<7;i++) {
		matrix.get(j).add(x[i]+(j+1));		
			}
		}
	}
	public final ArrayList<ArrayList<String>> getMatrix() {
		return matrix;
	}
	public final void setMatrix(ArrayList<ArrayList<String>> matrix) {
		this.matrix = matrix;
	}
}

