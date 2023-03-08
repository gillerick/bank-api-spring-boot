package com.example.simplebankapi.repositories;

import com.example.simplebankapi.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CardRepository extends JpaRepository<Card, Long> {
  @Override
  Optional<Card> findById(Long id);

  Card save(Card card);

  void delete(Card card);
}
