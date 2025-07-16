package br.com.dio.exception;

public final class CardFinishedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CardFinishedException(String message) {
        super(message);
    }

    public CardFinishedException(String message, Throwable cause) {
        super(message, cause);
    }
}
