package com.miguelgs.springboot.app.springbootweb.models;


public class Usuario {
    private String nombre;
    private String apellido;
    private String email;

    public Usuario(){
    }
    public Usuario(String nombre,String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
    public Usuario(String nombre,String apellido,String email){
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}