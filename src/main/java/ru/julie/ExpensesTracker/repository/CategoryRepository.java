package ru.julie.ExpensesTracker.repository;

import ru.julie.ExpensesTracker.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Category findByName(String category);
}
