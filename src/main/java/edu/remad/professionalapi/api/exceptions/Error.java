package edu.remad.professionalapi.api.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * For every error this class is used.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Error {

  /**
   * serial version UID
   */
  private static final long serialVersionUID = 1L;

  /**
   * App error code, which is different from HTTP error code.
   */
  private String errorCode;

  /**
   * Short, human-readable summary of the problem.
   */
  private String message;

  /**
   * HTTP status code.
   */
  private Integer status;

  /**
   * Url of request that produced the error.
   */
  private String url = "Not available";

  /**
   * Method of request that produced the error.
   */
  private String reqMethod = "Not available";

  // getters and setters (omitted)
}
