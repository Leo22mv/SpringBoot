package com.ejemplo.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;


   private String nombre;
   private String apellido;
   
   // public Usuario () {
   // }

   // public Usuario (Long id, String nombre, String apellido) {
   //  this.id = id;
   //  this.nombre = nombre;
   //  this.apellido = apellido;
   // }

}
