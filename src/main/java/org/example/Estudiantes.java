package org.example;

public class Estudiantes {
   private int codigo;
   private String nombre;
   private float nota;
   
   
   public Estudiantes(){
       codigo = 0;
       String nombre = "";
       float nota = 0;
       
   }
    public void setCodigo(int cod){
        codigo = cod;
    }
    
    public void setNombre(String nom){
        nombre = nom;
    }
    
    public void setNota(float n){
        nota = n;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public float getNota(){
        return nota;
    }
}
