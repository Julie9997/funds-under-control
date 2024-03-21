package ru.julie.ExpensesTracker.service;

import ru.julie.ExpensesTracker.entity.Client;

public interface ClientService {
    void saveClient(Client client);
    Client findClientById(int id);
}
