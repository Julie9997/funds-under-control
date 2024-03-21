package ru.julie.ExpensesTracker.repository;

import ru.julie.ExpensesTracker.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
    List<Expense> findByClientId(int id);
}
