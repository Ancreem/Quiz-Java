
package com.mycompany.patronesandrespardo;

public class Main {
    public static void main(String[] args) {
        SmartPhoneAdapter motorolaAplicacion = new SmartPhoneAdapter();
        SmartPhone motorola = new SmartPhone();
        
        motorola.iniciarAplicacion();
        motorola.escanearDispositivosEnLaRed();
        motorola.seleccionarDispositivo();
        motorolaAplicacion.encender();
        motorolaAplicacion.cambiarEntrada();
        motorolaAplicacion.manipularVolumen();
        motorolaAplicacion.apagar();
    }
}
