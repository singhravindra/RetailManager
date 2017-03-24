package RESTAPI.RetailManager.exception;

public class DataNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7139434648783670551L;

	public DataNotFoundException(String ex){
		super(ex);
	}
}
