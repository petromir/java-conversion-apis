package com.petromirdzhunev.json.conversion.api;

/**
 * Exception thrown when an error occurs during JSON conversion.
 */
public class JsonConversionException extends RuntimeException {

	/**
	 * Constructs a new JsonConversionException with the specified detail message.
	 *
	 * @param message the detail message
	 */
	public JsonConversionException(final String message) {
		super(message);
	}

	/**
	 * Constructs a new JsonConversionException with the specified detail message and cause.
	 *
	 * @param message the detail message
	 * @param cause the cause of the exception
	 */
	public JsonConversionException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
