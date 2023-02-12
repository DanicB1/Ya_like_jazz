package examLog;

public class Rectangle {
	private float a, b;
	
	public Rectangle(float a, float b) {
		this.a = a;
		this.b = b;
	}
	
	public float surface() {
		return a * b;
	}
}
