package phasenumtwo;

/**
 * User-defined unchecked exception used when an entered age is not acceptable.
 */
public class InvalidAgeException extends RuntimeException {
	public InvalidAgeException(String message) {
		super(message);
	}
}
