package db;

public class DBIntegrityException extends RuntimeException{

	public DBIntegrityException(String msg) {
		super(msg);
	}
	private static final long serialVersionUID = 1L;

}
