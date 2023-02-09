package com.ejemplo.SpringBoot.service;

import java.util.List;

import com.ejemplo.SpringBoot.model.Usuario;

public interface IUsuarioService {
    public List<Usuario> verUsuarios ();
    public void crearUsuario (Usuario per);
    public void borrarUsuario (Long id);
    public Usuario buscarUsuario (Long id);
}
