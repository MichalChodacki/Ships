
public class Enemy {
	int x;
	int y;
	static int count;
	String shot;
	//Matrix matrix;
	
	Enemy(Matrix matrix){
		shot=this.shot;
		shot = matrix.getMatrix().get(y).get(x);
		//matrix=this.matrix;
		while((shot=="chuj")) {
		x = (int)((Math.random()*7));	
		y = (int)((Math.random()*7));
		
		
		shot = matrix.getMatrix().get(y).get(x);
		
		}
		matrix.getMatrix().get(y).set(x, "chuj");
		count++;
		
		System.out.println(count);
	
	}

	public final int getX() {
		return x;
	}

	public final int getY() {
		return y;
	}

	public static final int getCount() {
		return count;
	}
}
