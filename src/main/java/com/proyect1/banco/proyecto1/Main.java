package com.proyect1.banco.proyecto1;

import com.proyect1.banco.proyecto1.entities.*;
import com.proyect1.banco.proyecto1.services.servicesImp.ServicioCuentasImpl;


public class Main {
    public static void main(String[] args) {
        // Crear domicilios
        Domicilio domicilio1 = new Domicilio("Calle 123", 456, "Colonia", "Estado", "País", 12345);
        Domicilio domicilio2 = new Domicilio("Avenida 456", 789, "Colonia", "Estado", "País", 67890);

        // Crear banco
        Banco banco = new Banco("Banco Ejemplo", domicilio1, "RFCBANCO123", "1234567890");

        // Crear clientes
        Cliente cliente1 = new Cliente(1, "Juan Perez", "3205353", "juan@example.com", "RFC123", "01/01/1980", "Activo", domicilio1);
        Cliente cliente2 = new Cliente(2, "Maria Lopez", "3415659", "caro@example.com", "RFC456", "02/02/1985", "Activo", domicilio2);

        // Agregar clientes al banco
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);

        // Crear servicio de cuentas
        ServicioCuentasImpl servicioCuentas = new ServicioCuentasImpl();

        // Crear cuentas
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(1001, 5000.0, "Activa", "01/01/2022", 0.03);
        CuentaCheque cuentaCheque1 = new CuentaCheque(1002, 2000.0, "Activa", "01/01/2022", 1000.0);
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro(1003, 3000.0, "Activa", "01/01/2022", 0.02);
        CuentaCheque cuentaCheque2 = new CuentaCheque(1004, 4000.0, "Activa", "01/01/2022", 500.0);

        // Agregar cuentas al servicio de cuentas
        servicioCuentas.agregarCuenta(cuentaAhorro1);
        servicioCuentas.agregarCuenta(cuentaCheque1);
        servicioCuentas.agregarCuenta(cuentaAhorro2);
        servicioCuentas.agregarCuenta(cuentaCheque2);

        // Asignar cuentas a los clientes
        cliente1.setCuentas(new Cuenta[]{cuentaAhorro1, cuentaCheque1});
        cliente2.setCuentas(new Cuenta[]{cuentaAhorro2, cuentaCheque2});

        // Validar el funcionamiento
        System.out.println("Clientes en el banco:");
        for (Cliente cliente : banco.obtenerClientes()) {
            System.out.println(cliente.toString());
        }

        System.out.println("\nCuentas en el servicio de cuentas:");
        for (Cuenta cuenta : servicioCuentas.obtenerCuentas()) {
            System.out.println("Número de cuenta: " + cuenta.getNumero() + ", Saldo: " + cuenta.getSaldo());
        }

        // Operaciones en cuentas
        servicioCuentas.abonarCuenta(1001, 1000.0);
        servicioCuentas.retirar(1002, 500.0);

        System.out.println("\nCuentas después de operaciones:");
        for (Cuenta cuenta : servicioCuentas.obtenerCuentas()) {
            System.out.println("Número de cuenta: " + cuenta.getNumero() + ", Saldo: " + cuenta.getSaldo());
        }
    }
}


