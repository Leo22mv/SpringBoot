package com.ejemplo.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.SpringBoot.model.Usuario;

@Repository
public interface UsuarioRepository  extends JpaRepository <Usuario, Long>{
        
}
