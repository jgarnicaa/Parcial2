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
public class Oficina extends Local {
    public String tipo;

    public Oficina(String tipo, boolean arrendado, String Barrio, int Estrato, double ValorA, double AreaC) {
        super(arrendado, Barrio, Estrato, ValorA, AreaC);
        this.tipo = tipo;
    }
    
    @Override
    public void DarInfo() {
        System.out.println("Tipo: "+ this.tipo+" ¿Está arrendado? "+this.arrendado+", Barrio: "+this.Barrio+", Estrato: "+this.Estrato+", Valor arrendamiento: "+this.ValorA+", Area Construida: "+AreaC);   
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
