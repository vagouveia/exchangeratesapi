package br.com.vitor.exchangeratesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vitor.exchangeratesapi.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
