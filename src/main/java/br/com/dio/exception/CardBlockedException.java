package br.com.dio.exception;

public final class CardBlockedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CardBlockedException(String message) {
        super(message);
    }

    public CardBlockedException(String message, Throwable cause) {
        super(message, cause);
    }
}
