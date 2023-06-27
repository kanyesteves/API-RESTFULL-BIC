package com.example.bic.repositories;

import com.example.bic.models.PencilProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PencilProductRepository extends JpaRepository<PencilProductModel, UUID> {
}
