package com.proyect1.banco.proyecto1.entities;

public class Cliente {
    private int numero;
    private String nombre;
    private String telefono;
    private String email;
    private String rfc;
    private String fechaNacimiento;
    private String estatus;
    private Domicilio domicilio;
    private Cuenta[] cuentas;

    public Cliente(int numero, String nombre, String telefono, String email, String rfc, String fechaNacimiento, String estatus, Domicilio domicilio) {
        this.numero = numero;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.rfc = rfc;
        this.fechaNacimiento = fechaNacimiento;
        this.estatus = estatus;
        this.domicilio = domicilio;
    }

    // Getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }
}
