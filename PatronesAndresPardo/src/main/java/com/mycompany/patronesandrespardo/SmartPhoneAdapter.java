
package com.mycompany.patronesandrespardo;


public class SmartPhoneAdapter extends DispositivoManipulacionTV{
    
    private SmartPhone smartPhone;
    
    public SmartPhoneAdapter(){
        super();
        this.smartPhone = new SmartPhone();
        System.out.println("Creando un SmartPhone adapter");
    }

    @Override
    void encender() {
        try {
            smartPhone.iniciarDispositivo();
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    void apagar() {
        try {
            smartPhone.detenerDispositivo();
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    void manipularVolumen() {
        try {
            smartPhone.manipularVolumen();
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    void cambiarEntrada() {
        try {
            smartPhone.cambiarEntrada();
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
    
}
