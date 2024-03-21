package ru.julie.ExpensesTracker.service;

import ru.julie.ExpensesTracker.DTO.ExpenseDTO;
import ru.julie.ExpensesTracker.DTO.FilterDTO;
import ru.julie.ExpensesTracker.entity.Expense;

import java.util.List;

public interface ExpenseService {
    Expense findExpenseById(int id);
    void save(ExpenseDTO expenseDTO);
    void update(ExpenseDTO expenseDTO);
    List<Expense> findAllExpenses();
    List<Expense> findAllExpensesByClientId(int id);
    void deleteExpenseById(int id);
    List<Expense> findFilterResult(FilterDTO filter);

}
