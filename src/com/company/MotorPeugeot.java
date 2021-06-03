package com.company;

public class MotorPeugeot implements Motor{

    private String nombre;

    public MotorPeugeot() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public void encender() {
        System.out.println("Motor Peugeot enciende");
    }

    @Override
    public void apagar() {
        System.out.println("Motor Peugeot apaga");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor Peugeot acelera");
    }

    @Override
    public void frenar() {
        System.out.println("Motor Peugeot frena");
    }
}
