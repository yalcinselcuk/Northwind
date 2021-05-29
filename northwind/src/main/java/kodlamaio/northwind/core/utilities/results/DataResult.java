package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {
	
	private T data;
	
	public DataResult(T data,boolean success, String message) {
	
		super(success, message);
		// DataResult ' a gonderilen success ve message ' i super ile Base olan Result a gonderip kullandik
		this.data = data;
	}
	
	public DataResult(T data,boolean success) {
		
		super(success);

		this.data = data;
	}

	public T getData() {
		return this.data;
	}	

}
