package InputDot.InputDot.Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import InputDot.InputDot.Analyser;
import InputDot.InputDot.Stream;

public class Negative {
	
	@DataProvider(name = "negative")
	public String[][] generatorNegative() {

		String[][] arr = new String[36][2];

		String[] val = new String[6];

		val[0] = ".";
		val[1] = "щ";
		val[2] = "s";
		val[3] = "3";
		val[4] = "#";
		val[5] = " ";

		int i = 0;

		for (int j = 0; j < 6; j++) {

			for (int k = 0; k < 6; k++) {

				arr[i][0] = val[j];
				arr[i][1] = val[k];

				i++;

			}

		}

		return arr;

	}

	@Test(dataProvider = "negative")
	public void negativeTest(String first, String second) {

		Stream st = new Stream();
		Analyser a = new Analyser();

		st.setLine(first+second);

		a.go(st);

		Assert.assertEquals(st.getIsError() && st.getIsEnd(), true);
	}
	
	@Test (priority=3)
	public void empbty() {

		Stream st = new Stream();
		Analyser a = new Analyser();

		
		st.setLine("");
		
		a.go(st);	
				
		
		Assert.assertEquals(st.getIsError()&&st.getIsEnd(), true);
	}
	
	
}
