package sistema.service;

public class NegocioException extends RuntimeException {

	private static final long serialVersionUID = -5589872366996588592L;

	public NegocioException(String msg) {
		super(msg);
	}

	public NegocioException(String message, Throwable cause) {
        super(message, cause);
    }
}
