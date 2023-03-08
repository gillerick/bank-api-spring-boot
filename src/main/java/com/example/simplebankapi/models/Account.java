package com.example.simplebankapi.models;

import java.math.BigDecimal;

public class Account {
  public AccountType accountType;
  public AccountStatus accountStatus;
  public BigDecimal availableBalance;
  public String userId;
}
