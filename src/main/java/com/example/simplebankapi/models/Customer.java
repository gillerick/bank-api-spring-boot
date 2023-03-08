package com.example.simplebankapi.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;
  @Column(unique = true)
  public String userId;
  public String firstName;
  public String lastName;

  @Column(unique = true)
  public String email;

  @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<Account> accounts;
  @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<Card> cards;
}
