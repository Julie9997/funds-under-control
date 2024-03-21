package ru.julie.ExpensesTracker.repository;

import ru.julie.ExpensesTracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String username);
}
