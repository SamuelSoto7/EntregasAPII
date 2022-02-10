package exception;

public class NegativeNumberException extends Exception {
	
	public NegativeNumberException(String name, Double weight) {
		super("Est� intentando usar un valor negativo " + weight+ " para el ingrediente " + name + ".");
		
	}

}
