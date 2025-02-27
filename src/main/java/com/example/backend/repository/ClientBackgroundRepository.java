package com.example.backend.repository;

import com.example.backend.model.ClientBackground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientBackgroundRepository extends JpaRepository<ClientBackground, Long> {
}
