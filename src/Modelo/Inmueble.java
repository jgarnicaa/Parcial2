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
public abstract class Inmueble {
    public String Barrio;
    public int Estrato;
    public double ValorA;
    public double AreaC;

    public Inmueble(String Barrio, int Estrato, double ValorA, double AreaC) {
        this.Barrio = Barrio;
        this.Estrato = Estrato;
        this.ValorA = ValorA;
        this.AreaC = AreaC;
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

public abstract void DarInfo();
    
    
}
