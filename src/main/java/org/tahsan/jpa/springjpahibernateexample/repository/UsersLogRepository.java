package org.tahsan.jpa.springjpahibernateexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tahsan.jpa.springjpahibernateexample.model.UsersLog;

public interface UsersLogRepository extends JpaRepository<UsersLog, Integer> {
}
