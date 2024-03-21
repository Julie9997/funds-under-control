package ru.julie.ExpensesTracker.service;

import ru.julie.ExpensesTracker.entity.Category;

public interface CategoryService {
    Category findCategoryByName(String name);
    Category findCategoryById(int id);
}
