package com.exceptions.exception.exceptions;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage extends Exception {
  private int statusCode;
  private Date timestamp;
  private String message;
  private String description;

  
}
