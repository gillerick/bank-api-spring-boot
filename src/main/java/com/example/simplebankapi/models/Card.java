package com.example.simplebankapi.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "card")
public class Card implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;
  public String cardId;
  public String customerName;
  public String expiryDate;
  public String userId;

  @ManyToOne
  @JoinColumn(name = "id", nullable = false)
  public Account account;

  public Card(Long id, String cardId, String customerName, String expiryDate, String userId) {
    this.id = id;
    this.cardId = cardId;
    this.customerName = customerName;
    this.expiryDate = expiryDate;
    this.userId = userId;
  }

  public Card() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCardId() {
    return cardId;
  }

  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
}
