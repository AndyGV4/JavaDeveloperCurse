package com.proyect1.banco.proyecto1.services.servicesImp;


import com.proyect1.banco.proyecto1.entities.Cuenta;
import com.proyect1.banco.proyecto1.services.ServicioCuentas;

import java.util.ArrayList;
import java.util.List;

public class ServicioCuentasImpl implements ServicioCuentas {
    private List<Cuenta> cuentas;

    public ServicioCuentasImpl() {
        this.cuentas = new ArrayList<>();
    }

    @Override
    public boolean agregarCuenta(Cuenta cuenta) {
        return cuentas.add(cuenta);
    }

    @Override
    public boolean cancelarCuenta(int numero) {
        return cuentas.removeIf(cuenta -> cuenta.getNumero() == numero);
    }

    @Override
    public void abonarCuenta(int numero, double abono) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numero) {
                cuenta.depositar(abono);
                return;
            }
        }
    }

    @Override
    public void retirar(int numero, double retiro) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numero) {
                cuenta.retirar(retiro);
                return;
            }
        }
    }

    @Override
    public Cuenta[] obtenerCuentas() {
        return cuentas.toArray(new Cuenta[0]);
    }

    public void transferir(int numeroCuentaOrigen, int numeroCuentaDestino, double monto) {
        Cuenta cuentaOrigen = null;
        Cuenta cuentaDestino = null;

        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numeroCuentaOrigen) {
                cuentaOrigen = cuenta;
            }
            if (cuenta.getNumero() == numeroCuentaDestino) {
                cuentaDestino = cuenta;
            }
        }

        if (cuentaOrigen != null && cuentaDestino != null && cuentaOrigen.getSaldo() >= monto) {
            cuentaOrigen.retirar(monto);
            cuentaDestino.depositar(monto);
        } else {
            System.out.println("Transferencia fallida. Verifique los datos e intente nuevamente.");
        }
    }

}

