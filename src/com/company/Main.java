package com.company;

public class Main {

    public static void main(String[] args) {

     Motor motor = new MotorAudi("Motor Audi");
     Auto auto1 = new Auto(motor,"WE56DD",5);
        System.out.println(auto1);
        motor.encender();
        System.out.println("***************************************************");


        MotorFord motorFord = new MotorFord();
        motorFord.setNombre("Motor Ford");
        Auto auto = new Auto(motorFord,"DE78GF",3);
        System.out.println(auto);
        motorFord.apagar();
        System.out.println("***************************************************");

        MotorPeugeot motorPeugeot = new MotorPeugeot();
        motorPeugeot.setNombre("Motor Peugeot");
        Auto auto2 = new Auto(motorPeugeot,"GF45HY",5);
        motorPeugeot.frenar();
        System.out.println(auto2);


    }
}
