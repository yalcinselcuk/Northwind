package kodlamaio.northwind.core.utilities.results;

public class Result {
	private boolean success; //islem basarili mi?
	private String message; //islem sonucuna gore ekrana cikacak yazi
	
	public Result(boolean success) {
		this.success = success;
	}
	public Result(boolean success,String message) {
		this(success); //do not repeat yourself
		this.message = message ;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
/*
	public void setSuccess(boolean success) {
		this.success = success;
	}
*/
	public String getMessage() {
		return this.message;
	}
/*
	public void setMessage(String message) {
		this.message = message;
	}
*/
	
}
