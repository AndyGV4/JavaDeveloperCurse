package com.proyect1.banco.proyecto1.services;

import com.proyect1.banco.proyecto1.entities.Cliente;

public interface ServicioClientes {
    boolean agregarCliente(Cliente cliente);
    boolean eliminarCliente(int numero);
    Cliente consultarCliente(int numero);
    Cliente[] obtenerClientes();
    Cliente buscarClientePorRFC(String rfc);
}
