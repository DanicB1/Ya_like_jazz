package examLog;

public class Recursive {

	public static void main(String[] args) {
		System.out.println(f(2));
	}

	private static int f(int x) {
		if (x == 0) {
			return 1;
		}
		
		return f(x - 1) * 5 + 1;
	}
}
