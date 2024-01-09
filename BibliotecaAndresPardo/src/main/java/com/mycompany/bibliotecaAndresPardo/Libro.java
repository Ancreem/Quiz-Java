package com.mycompany.bibliotecaAndresPardo;

public class Libro extends Recurso{
    
    private String autor;
    
    
    public Libro(int id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
    }
    
}
