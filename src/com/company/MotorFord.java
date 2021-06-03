package com.company;

public class MotorFord implements Motor{

    private String nombre;

    public MotorFord() {
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
        System.out.println("Motor Ford enciende");
    }

    @Override
    public void apagar() {
        System.out.println("Motor Ford se apaga");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor Ford acelera");
    }

    @Override
    public void frenar() {
        System.out.println("Motor Ford frena");
    }
}
