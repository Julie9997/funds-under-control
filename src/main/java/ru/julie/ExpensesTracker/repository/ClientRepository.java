package ru.julie.ExpensesTracker.repository;

import ru.julie.ExpensesTracker.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
