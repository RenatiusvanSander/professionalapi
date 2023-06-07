package edu.remad.professionalapi.api.exceptions;

public class MyErrorException extends RuntimeException{

  private Error error;

  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }
}
