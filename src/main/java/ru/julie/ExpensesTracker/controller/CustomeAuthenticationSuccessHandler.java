package ru.julie.ExpensesTracker.controller;

import ru.julie.ExpensesTracker.entity.Client;
import ru.julie.ExpensesTracker.entity.User;
import ru.julie.ExpensesTracker.service.ClientService;
import ru.julie.ExpensesTracker.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Data
@AllArgsConstructor
@Controller
public class CustomeAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    UserService userService;
    ClientService clientService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response
            , Authentication authentication) throws IOException, ServletException {
        String username = authentication.getName();
        User user = userService.findUserByUserName(username);
        Client client = clientService.findClientById(user.getId());
        HttpSession session = request.getSession();
        session.setAttribute("client", client);
        response.sendRedirect(request.getContextPath()+"/list");
    }
}
