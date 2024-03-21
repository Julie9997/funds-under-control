package ru.julie.ExpensesTracker.service;

import ru.julie.ExpensesTracker.entity.Role;

public interface RoleService{
    Role findRoleByName(String name);
}
