/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class LocalC extends Local{
 
    public String descripcion;
    public boolean ubicacion;

    public LocalC(String descripcion, boolean ubicacion, boolean arrendado, String Barrio, int Estrato, double ValorA, double AreaC) {
        super(arrendado, Barrio, Estrato, ValorA, AreaC);
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
    }
    
    @Override
    public void DarInfo() {
        System.out.println("Descripcion: "+this.descripcion+" ¿Está ubicado en vía principal? "+this.ubicacion+" ¿Está arrendado? "+this.arrendado+", Barrio: "+this.Barrio+", Estrato:"+this.Estrato+", Valor de arrendamiento: "+this.ValorA+", Area Construida: "+this.AreaC);
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(boolean ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isArrendado() {
        return arrendado;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String Barrio) {
        this.Barrio = Barrio;
    }

    public int getEstrato() {
        return Estrato;
    }

    public void setEstrato(int Estrato) {
        this.Estrato = Estrato;
    }

    public double getValorA() {
        return ValorA;
    }

    public void setValorA(double ValorA) {
        this.ValorA = ValorA;
    }

    public double getAreaC() {
        return AreaC;
    }

    public void setAreaC(double AreaC) {
        this.AreaC = AreaC;
    }


    
    
}
