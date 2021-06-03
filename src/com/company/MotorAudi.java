package com.company;

public class MotorAudi implements Motor{

    private  String nombre ;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre ;
    }

    public MotorAudi(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void encender() {
        System.out.println("El Motor Audi enciende");
    }

    @Override
    public void apagar() {
        System.out.println("Motor Audi se apaga");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor Audi acelera");
    }

    @Override
    public void frenar() {
        System.out.println("Motor Audi frena");
    }
}
