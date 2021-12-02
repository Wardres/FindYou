package com.example.findyou.modelos;

public class Usuario {
    private int id;
    private String email;
    private String clave;
    private String nombres;
    private String apellidos;

    public Usuario() {
    }

    public Usuario(int id, String email, String clave, String nombres, String apellidos) {
        this.id = id;
        this.email = email;
        this.clave = clave;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
