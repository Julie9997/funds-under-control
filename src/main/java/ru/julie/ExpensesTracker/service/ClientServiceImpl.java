package ru.julie.ExpensesTracker.service;

import ru.julie.ExpensesTracker.entity.Client;
import ru.julie.ExpensesTracker.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    ClientRepository clientRepository;
    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Client findClientById(int id) {
        return clientRepository.findById(id).orElse(null);
    }
}
