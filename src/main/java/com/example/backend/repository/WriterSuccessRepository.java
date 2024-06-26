package com.example.backend.repository;

import com.example.backend.model.WriterSuccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WriterSuccessRepository extends JpaRepository<WriterSuccess, Long> {
}

