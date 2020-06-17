package com.github.fantasticlab.jdbc.reflection;

/**
 * 反射异常
 */
public class ReflectionException extends RuntimeException {


  public ReflectionException() {
    super();
  }

  public ReflectionException(String message) {
    super(message);
  }

  public ReflectionException(String message, Throwable cause) {
    super(message, cause);
  }

  public ReflectionException(Throwable cause) {
    super(cause);
  }

}