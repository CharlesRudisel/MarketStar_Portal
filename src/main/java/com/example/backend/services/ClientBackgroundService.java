package com.example.backend.services;

import com.example.backend.model.ClientBackground;
import com.example.backend.repository.ClientBackgroundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientBackgroundService {

    @Autowired
    private ClientBackgroundRepository clientBackgroundRepository;

    public List<ClientBackground> getAllClientBackgrounds() {
        return clientBackgroundRepository.findAll();
    }

    public Optional<ClientBackground> getClientBackgroundById(Long id) {
        return clientBackgroundRepository.findById(id);
    }

    public ClientBackground saveClientBackground(ClientBackground clientBackground) {
        return clientBackgroundRepository.save(clientBackground);
    }

    public List<ClientBackground> saveAllClientBackgrounds(List<ClientBackground> clientBackgrounds) {
        return clientBackgroundRepository.saveAll(clientBackgrounds);
    }

    public void deleteClientBackground(Long id) {
        clientBackgroundRepository.deleteById(id);
    }
}
