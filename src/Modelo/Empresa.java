/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author jgarn
 */
public class Empresa {
    private String nombre;
    ArrayList<Inmueble> inmuebles=new ArrayList<>();

    
    public Empresa(String nombre) {
        this.nombre = nombre;
    }
public void ListarInmueble(){
for(int i=0;i<inmuebles.size();i++){
inmuebles.get(i).DarInfo();
}
}
    
    public void addInmueble(Inmueble i){
    
    this.inmuebles.add(i);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }
    
    
}
