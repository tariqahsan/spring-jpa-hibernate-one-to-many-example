package org.tahsan.jpa.springjpahibernateexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tahsan.jpa.springjpahibernateexample.model.UsersContact;

public interface UsersContactRepository extends JpaRepository<UsersContact, Integer> {
}
