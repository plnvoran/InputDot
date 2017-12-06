package InputDot.InputDot;

public class Game {

	public static void main(String[] args) {

		Scunner sc = new Scunner();
		Stream st = new Stream();
		Analyser a = new Analyser();
		
		
		while (!st.getIsEnd()) {

			st.setLine(sc.input());
			
			a.go(st);

			a.print(st);

		}
	}

}
