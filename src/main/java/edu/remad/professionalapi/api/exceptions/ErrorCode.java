package edu.remad.professionalapi.api.exceptions;

import lombok.Getter;

/**
 * The error codes for the api
 */
@Getter
public enum ErrorCode {

  // Internal Errors: 1 to 0999
  GENERIC_ERROR("API-0001", "The system is unable to complete the request. Contact system support."),
  HTTP_MEDIATYPE_NOT_SUPPORTED("API-0002", "Requested media type is not supported. Please use application/json or application/xml as 'Content-Type' header value"),
  HTTP_MESSAGE_NOT_WRITABLE("API-0003", "Missing 'Accept' header. Please add 'Accept' header."),
  HTTP_MEDIA_TYPE_NOT_ACCEPTABLE("API-0004", "Requested 'Accept' header value is not supported. Please use application/json or application/xml as 'Accept' value"),
  JSON_PARSE_ERROR("API-0005", "Make sure request payload should be a valid JSON object."),
  HTTP_MESSAGE_NOT_READABLE("API-0006", "Make sure request payload should be a valid JSON or XML object according to 'Content-Type'."),
  INTERNAL_SERVER_ERROR("API-0416", "Please contact support. Here is an internal server error.");

  private String errorCode;

  /**
   * error message key
   */
  private String errorMessageKey;

  /**
   * Creates instance of {@link ErrorCode}
   * @param errorCode error code as sequence number
   * @param errorMessageKey error message as key
   */
  ErrorCode(final String errorCode, final String errorMessageKey) {
    this.errorCode = errorMessageKey;
    this.errorMessageKey = errorMessageKey;
  }
}
