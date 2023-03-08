package com.example.simplebankapi.repositories;

import com.example.simplebankapi.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
  @Override
  Optional<Account> findById(Long id);

  Account save(Account account);

  void delete(Account account);
}
