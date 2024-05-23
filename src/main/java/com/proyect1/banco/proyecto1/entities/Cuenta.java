package com.proyect1.banco.proyecto1.entities;

public abstract class Cuenta {
    protected int numero;
    protected double saldo;
    protected String estatus;
    protected String fechaApertura;

    public Cuenta(int numero, double saldo, String estatus, String fechaApertura) {
        this.numero = numero;
        this.saldo = saldo;
        this.estatus = estatus;
        this.fechaApertura = fechaApertura;
    }

    public abstract void depositar(double monto);
    public abstract void retirar(double monto);
    public abstract void consultarSaldo();

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getEstatus() {
        return estatus;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }
}
