package com.example.simplebankapi.models;

public enum AccountType {
  CURRENT(0, "CURRENT"),
  SAVINGS(1, "SAVINGS");

  private int code;
  private String value;

  AccountType(int code, String value) {
    this.code = code;
    this.value = value;
  }

  AccountType() {
  }

  public int getCode() {
    return code;
  }

  public String getValue() {
    return value;
  }

  public static AccountType fromCode(int code) {
    for (AccountType type : values()) {
      if (type.getCode() == code) {
        return type;
      }
    }
    throw new IllegalArgumentException("Invalid account type code: " + code);

  }
}
