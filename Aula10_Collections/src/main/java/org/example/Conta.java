package org.example;

public class Conta implements Comparable<Conta> {

    private float saldo;
    private String dono;

    public Conta(float saldo, String dono) {
        this.saldo = saldo;
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getDono() {
        return dono;
    }

    @Override
    public int compareTo(Conta o) {
        return dono.compareTo(o.dono);
    }
}
