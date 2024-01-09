
package com.mycompany.patronesandrespardo;


public class PanelTV extends DispositivoManipulacionTV{

    @Override
    void encender() {
        System.out.println("Encendiendo el televisor con PanelTV");
    }

    @Override
    void apagar() {
        System.out.println("Apagando el televisor con PanelTV");
    }

    @Override
    void manipularVolumen() {
        System.out.println("Manipulando el volumen con PanelTV");
    }

    @Override
    void cambiarEntrada() {
        System.out.println("Entrando al menu de cambio de entrada con PanelTV");
    }
    
}
