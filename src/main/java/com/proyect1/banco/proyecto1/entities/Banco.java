package com.proyect1.banco.proyecto1.entities;

import com.proyect1.banco.proyecto1.services.ServicioClientes;

import java.util.ArrayList;
import java.util.List;

public class Banco implements ServicioClientes {
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private List<Cliente> clientes;

    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.clientes = new ArrayList<>();
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        return clientes.add(cliente);
    }

    @Override
    public boolean eliminarCliente(int numero) {
        return clientes.removeIf(cliente -> cliente.getNumero() == numero);
    }

    @Override
    public Cliente consultarCliente(int numero) {
        for (Cliente cliente : clientes) {
            if (cliente.getNumero() == numero) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Cliente[] obtenerClientes() {
        return clientes.toArray(new Cliente[0]);
    }

    @Override
    public Cliente buscarClientePorRFC(String rfc) {
        for (Cliente cliente : clientes) {
            if (cliente.getRfc().equals(rfc)) {
                return cliente;
            }
        }
        return null;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
