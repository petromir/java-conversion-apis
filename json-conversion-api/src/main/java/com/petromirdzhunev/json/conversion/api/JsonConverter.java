package com.petromirdzhunev.json.conversion.api;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Interface for JSON conversion operations, providing a common abstraction over different JSON libraries.
 *
 * @param <DELEGATE> the type of the underlying JSON library delegate (e.g., Jackson's ObjectMapper or Gson)
 */
public interface JsonConverter<DELEGATE> {

	/**
	 * Converts the given object to its JSON string representation.
	 *
	 * @param object the object to convert
	 * @param <TYPE> the type of the object
	 * @return the JSON string representation of the object
	 * @throws JsonConversionException if the conversion fails
	 */
	<TYPE> String objectToJson(TYPE object);

	/**
	 * Converts a JSON string to an object of the specified type.
	 *
	 * @param json the JSON string to convert
	 * @param type the class of the target object
	 * @param <TYPE> the type of the target object
	 * @return the converted object
	 * @throws JsonConversionException if the conversion fails
	 */
	<TYPE> TYPE jsonToObject(String json, Class<TYPE> type);

	/**
	 * Converts a JSON string to a {@link List} containing elements of the specified type.
	 *
	 * @param json the JSON string to convert
	 * @param listElementType the class of the elements in the list
	 * @param <TYPE> the type of the elements in the list
	 * @return a list of converted objects
	 * @throws JsonConversionException if the conversion fails
	 */
	<TYPE> List<TYPE> jsonToList(final String json, Class<TYPE> listElementType);

	/**
	 * Converts a JSON string to a {@link Map} with keys and values of the specified types.
	 *
	 * @param json the JSON string to convert
	 * @param keyType the class of the map keys
	 * @param valueType the class of the map values
	 * @param <KEY> the type of the map keys
	 * @param <VALUE> the type of the map values
	 * @return a map of converted objects
	 * @throws JsonConversionException if the conversion fails
	 */
	<KEY, VALUE> Map<KEY, VALUE> jsonToMap(final String json, Class<KEY> keyType, Class<VALUE> valueType);

	/**
	 * Converts a JSON string to a {@link Set} containing elements of the specified type.
	 *
	 * @param json the JSON string to convert
	 * @param setElementType the class of the elements
	 * @param <TYPE> the type of the elements
	 * @return a set of converted objects
	 * @throws JsonConversionException if the conversion fails
	 */
	<TYPE> Set<TYPE> jsonToSet(final String json, Class<TYPE> setElementType);

	/**
	 * Returns the underlying JSON library delegate.
	 *
	 * @return the delegate instance
	 */
	DELEGATE delegate();
}
