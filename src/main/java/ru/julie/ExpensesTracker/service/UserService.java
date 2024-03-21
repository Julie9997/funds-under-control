package ru.julie.ExpensesTracker.service;

import ru.julie.ExpensesTracker.DTO.WebUser;
import ru.julie.ExpensesTracker.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findUserByUserName(String username);

    void save(WebUser webUser);
}
