package com.example.repository;

import com.example.entity.Account;

import java.util.Optional;

public class JpaAccountRepository implements AccountRepository{
    @Override
    public Optional<Account> findById(String number) {
        return Optional.empty();
    }

    @Override
    public Account save(Account account) {
        return null;
    }
}
