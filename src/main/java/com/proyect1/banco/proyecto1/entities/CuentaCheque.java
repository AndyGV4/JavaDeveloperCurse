package com.proyect1.banco.proyecto1.entities;

import com.proyect1.banco.proyecto1.entities.Cuenta;

public class CuentaCheque extends Cuenta {
    private double sobregiroMaximo;

    public CuentaCheque(int numero, double saldo, String estatus, String fechaApertura, double sobregiroMaximo) {
        super(numero, saldo, estatus, fechaApertura);
        this.sobregiroMaximo = sobregiroMaximo;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        if (saldo + sobregiroMaximo >= monto) {
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
