package com.basic.testspringbootapp2.repository;

import com.basic.testspringbootapp2.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
