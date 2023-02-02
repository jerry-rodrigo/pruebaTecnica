package com.jtamara.spring.security.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jtamara.spring.security.login.models.Empresa;

@Repository
public interface UserRepository extends JpaRepository<Empresa, Long> {
  Optional<Empresa> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}
