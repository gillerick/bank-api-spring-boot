package com.example.simplebankapi.models;

import java.util.List;

public class Customer {
  public String UserId;
  public String FirstName;
  public String LastName;
  public String Email;
  public List<Account> Accounts;
  public List<Card> Cards;
}
