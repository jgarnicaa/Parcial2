/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Edificio extends Inmueble{
    public String nombrePro;
    ArrayList<Piso> pisos =new ArrayList<>();
    ArrayList<LocalC> locales=new ArrayList<>();

    public Edificio(String nombrePro, String Barrio, int Estrato, double ValorA, double AreaC) {
        super(Barrio, Estrato, ValorA, AreaC);
        this.nombrePro = nombrePro;
    }
    
    public boolean addPisos(Piso p){
    pisos.add(p);
    return true;
    }
    
    public boolean addLocal(LocalC l){
    locales.add(l);
    return true;
    }

    @Override
    public void DarInfo() {
       
    }
}
