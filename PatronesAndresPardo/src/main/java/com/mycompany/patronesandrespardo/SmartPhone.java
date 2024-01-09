
package com.mycompany.patronesandrespardo;

public class SmartPhone {
    private boolean conectado = false;

    public SmartPhone() {
        System.out.println("Creando SmartPhone");
        this.conectado = true;
    }
    
    public void iniciarAplicacion(){
        System.out.println("Iniciando aplicacion");
    }
    
    public void escanearDispositivosEnLaRed(){
        System.out.println("Buscando dispositivo...");
    }
    
    public void seleccionarDispositivo() {
        System.out.println("Seleccionando dispositivo...");
        this.conectado = true;
    }
    
    public void iniciarDispositivo() throws MyException{
        if (conectado == false )
                throw new MyException("No te has conectado a ningun dispositivo, Selecciona un dispositivo para poder prender el televisor\n");
        System.out.println("iniciando dispositivo");
    }
    
    public void detenerDispositivo() throws MyException{
        if (conectado == false )
                throw new MyException("No te has conectado a ningun dispositivo, Selecciona un dispositivo para poder apagar el televisor\n");
        System.out.println("deteniendo Dispositivo");
        this.conectado = false;
    }
    
    public void manipularDispositivo() throws MyException{
        if (conectado == false)
                throw new MyException("No te has conectado a ningun dispositivo");
        System.out.println("manipulando Dispositivo");
    }
    
    public void manipularVolumen() throws MyException{
        if (conectado == false)
                throw new MyException("No te has conectado a ningun dispositivo, Selecciona un dispositivo para poder manipular el volumen el televisor\n");
        System.out.println("Manipulando volumen con SmartPhone");
    }
    
    public void cambiarEntrada() throws MyException {
        if (conectado == false)
                throw new MyException("No te has conectado a ningun dispositivo, Selecciona un dispositivo para poder manipular la entrada en el televisor\n");
        System.out.println("Cambiando entrada con SmartPhone");
    }
    
    
}
