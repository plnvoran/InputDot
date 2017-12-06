package InputDot.InputDot.Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import InputDot.InputDot.Analyser;
import InputDot.InputDot.Stream;



public class Positive {

	
	
	@DataProvider(name = "positive")
	public String[] positiveGenerator() {

		String[] arr = new String[5];

		arr[0] = "2";
		arr[1] = "i";
		arr[2] = "ш";
		arr[3] = "#";
		arr[4] = " ";

		return arr;

	}

	@Test(priority=1, dataProvider = "positive")
	public void positiveTest(String stream) {

		Stream st = new Stream();
		Analyser a = new Analyser();

		
		st.setLine(stream);
		a.go(st);
		a.print(st);
				
		
		Assert.assertEquals(!st.getIsError()&&!st.getIsEnd(), true);
		Assert.assertEquals(st.getPrintLine().equals("You have input -"  + "'"+ st.getFirstSymbol()+ "'."), true);
	}
	
	@Test (priority=2)
	public void endTest() {

		Stream st = new Stream();
		Analyser a = new Analyser();

		
		st.setLine(".");
		
		a.go(st);	
		a.print(st);		
				
		
		Assert.assertEquals(!st.getIsError()&&st.getIsEnd(), true);
		Assert.assertEquals(st.getPrintLine().equals("End"), true);
	}
	
	
}
