package com.proyect1.banco.proyecto1.entities;

import com.proyect1.banco.proyecto1.entities.Cuenta;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres;

    public CuentaAhorro(int numero, double saldo, String estatus, String fechaApertura, double tasaInteres) {
        super(numero, saldo, estatus, fechaApertura);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

}
