package InputDot.InputDot;

public class Stream {

	private Boolean isError;
	private Boolean isEnd;
	private String line;
	private String firstSymbol;
	private String printLine;

	public Stream() {

		this.isError = false;
		this.isEnd = false;
		this.line = "";
		this.firstSymbol = "";
		this.printLine="";
	}


	public Boolean getIsError() {
		return isError;
	}

	public void setIsError(Boolean isError) {
		this.isError = isError;
	}

	public Boolean getIsEnd() {
		return isEnd;
	}

	public void setIsEnd(Boolean isEnd) {
		this.isEnd = isEnd;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		
		this.line = line;
		
		try {
		this.firstSymbol=line.substring(0, 1);
		}
		catch (StringIndexOutOfBoundsException e)
		{
			this.firstSymbol="x";
			this.line="xx";
		}
		
	}

	public String getFirstSymbol() {
		return firstSymbol;
	}

	
	public String getPrintLine() {
		return printLine;
	}

	public void setPrintLine(String printLine) {
		this.printLine = printLine;
	}
	

}
