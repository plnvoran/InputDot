package InputDot.InputDot;

public class Analyser {

	public void go(Stream s) {

		if (s.getLine().length() > 1) {

			s.setIsError(true);
			s.setIsEnd(true);
		}

		else if (s.getLine().length() == 1 && s.getLine().equals("."))

		{

			s.setIsEnd(true);

		}

	}

	public void print(Stream s) {

		if (s.getIsEnd()) {

			if (s.getIsError()) {
				s.setPrintLine("Error\n");			
			}

			s.setPrintLine(s.getPrintLine()+"End");	

		} else {
			s.setPrintLine("You have input -"  + "'"+ s.getFirstSymbol()+ "'.");
		}
		
		System.out.println(s.getPrintLine());

	}

	
	
	

}
