package ru.julie.ExpensesTracker.repository;

import ru.julie.ExpensesTracker.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String role);
}
