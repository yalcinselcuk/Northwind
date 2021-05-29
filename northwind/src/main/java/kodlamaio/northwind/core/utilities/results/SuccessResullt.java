package kodlamaio.northwind.core.utilities.results;

public class SuccessResullt extends Result {

	public SuccessResullt() {
		super(true);
	}
	public SuccessResullt(String message) {
		super(true,message); 
		
	}
	

}
