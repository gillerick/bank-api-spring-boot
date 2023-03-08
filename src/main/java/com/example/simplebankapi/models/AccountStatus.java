package com.example.simplebankapi.models;

public enum AccountStatus {
  ACTIVE(0, "ACTIVE"),
  INACTIVE(1, "INACTIVE");

  AccountStatus(int code, String value) {
    this.code = code;
    this.value = value;
  }

  private final int code;
  private final String value;

  public int getCode() {
    return code;
  }

  public String getValue() {
    return value;
  }

  public static AccountStatus fromCode(int code) {
    for (AccountStatus status : values()) {
      if (status.getCode() == code) {
        return status;
      }
    }
    throw new IllegalArgumentException("Invalid account status code: " + code);
  }


}
