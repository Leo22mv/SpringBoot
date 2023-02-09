package com.ejemplo.SpringBoot.Controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.SpringBoot.model.Usuario;
import com.ejemplo.SpringBoot.service.IUsuarioService;
import com.ejemplo.SpringBoot.service.UsuarioService;

@RestController
public class Controller {

    @Autowired
    private IUsuarioService userServ;

    // List<Usuario> listaUsuarios = new ArrayList();


    // Recibir parametros con PathVariable

    // localhost:8080/hola/kbe/22
    // Hola, kbe. Tenes 22 años

    @GetMapping ("/hola/{nombre}/{edad}")
    public String decirHola (@PathVariable String nombre, @PathVariable int edad) {
        return "Hola, " + nombre +". Tenes " + edad + " años";
    }

    // Recibir parametros con RequestParam

    // localhost:8080/chau?nombre=kbe&edad=22
    // Chau, kbe. Tenes 22 años

    // @GetMapping ("/chau")
    // public String decirChau (@RequestParam String nombre, @RequestParam int edad) {
    //     return "Chau, " + nombre +". Tenes " + edad + " años";
    // }

    @PostMapping ("/new/usuario")
    public void crearUsuario (@RequestBody Usuario user) {
        // listaUsuarios.add(user);
        userServ.crearUsuario(user);
    }

    @GetMapping ("/ver/usuarios")
    @ResponseBody
    public List<Usuario> verUsuarios() {
        return userServ.verUsuarios();
        // return listaUsuarios;
    }

    @DeleteMapping ("/delete/{id}")
    public void borrarUsuario (@PathVariable Long id) {
        userServ.borrarUsuario(id);
    }

}
