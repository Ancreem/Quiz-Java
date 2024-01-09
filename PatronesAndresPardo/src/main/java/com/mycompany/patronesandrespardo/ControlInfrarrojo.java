package com.mycompany.patronesandrespardo;

public class ControlInfrarrojo extends DispositivoManipulacionTV{
    

    @Override
    void apagar() {
        System.out.println("Apagando el televisor con control infrarojo");
    }

    @Override
    void manipularVolumen() {
        System.out.println("Manipulando el volumen con control infrarojo");
    }

    @Override
    void cambiarEntrada() {
        System.out.println("Entrando al menu de cambio de entrada con control infrarojo");
    }

    @Override
    void encender() {
        System.out.println("Encendiendo el televisor con control infrarojo");
    }
    
}
