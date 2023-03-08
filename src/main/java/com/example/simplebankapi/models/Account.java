package com.example.simplebankapi.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "account")
public class Account implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;
  public AccountType accountType;
  public AccountStatus accountStatus;
  public BigDecimal availableBalance;
  public String userId;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  public Customer customer;

  public Account(Long id, AccountType accountType, AccountStatus accountStatus, BigDecimal availableBalance, String userId) {
    this.id = id;
    this.accountType = accountType;
    this.accountStatus = accountStatus;
    this.availableBalance = availableBalance;
    this.userId = userId;
  }

  public Account() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }

  public AccountStatus getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(AccountStatus accountStatus) {
    this.accountStatus = accountStatus;
  }

  public BigDecimal getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(BigDecimal availableBalance) {
    this.availableBalance = availableBalance;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
}
