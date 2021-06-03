package com.company;

public class Auto{

    private Motor motor;
    private String patente;
    private Integer cant_puertas;

    public Auto() {
    }

    public Auto(Motor motor, String patente, Integer cant_puertas) {
        this.motor = motor;
        this.patente = patente;
        this.cant_puertas = cant_puertas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getCant_puertas() {
        return cant_puertas;
    }

    public void setCant_puertas(Integer cant_puertas) {
        this.cant_puertas = cant_puertas;
    }

    @Override
    public String toString() {
        return "Motor=" + motor +
                ", patente='" + patente + '\'' +
                ", cant_puertas=" + cant_puertas ;
    }
}
