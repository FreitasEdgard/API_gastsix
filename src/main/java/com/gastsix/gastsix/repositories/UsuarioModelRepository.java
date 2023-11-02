package com.gastsix.gastsix.repositories;

import com.gastsix.gastsix.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioModelRepository extends JpaRepository<UsuarioModel, UUID> {
}