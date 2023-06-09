package edu.remad.professionalapi.api.exceptions;

/**
 * utility class for errors
 */
public class ErrorUtils {

  private ErrorUtils() {}

  /**
   * Creates and return an error object
   *
   * @param errMsgKey error message key
   * @param errorCode error code
   * @param httpStatusCode number of the http status code
   * @param url theurl path
   * @return error, instance of {@link Error}
   */
  public static Error createError(final String errMsgKey, final ErrorCode errorCode, final Integer httpStatusCode, final String url) {
    Error error = new Error();
    error.setMessage(errMsgKey);
    error.setErrorCode(errorCode);
    error.setStatus(httpStatusCode);
    error.setUrl(url);

    return error;
  }
}
