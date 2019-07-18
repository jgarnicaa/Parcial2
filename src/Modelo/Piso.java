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
public class Piso extends Inmueble{
    public int numOfi;
    public double AreaT;
    ArrayList<Oficina> oficinas =new ArrayList<>();

    public Piso(int numOfi, double AreaT, String Barrio, int Estrato, double ValorA, double AreaC) {
        super(Barrio, Estrato, ValorA, AreaC);
        this.numOfi = numOfi;
        this.AreaT = AreaT;
    }
            @Override
    public void DarInfo() {
                System.out.println("Cantidad de oficinas: "+this.numOfi+", Area total: "+this.AreaT+", Barrio: "+this.Barrio+", Estrato "+this.Estrato+", Valor arriendo: "+this.ValorA+", Area construida: "+this.AreaC);
                System.out.println("Oficinas: ");
                for(int i = 0; i<this.oficinas.size();i++){
                oficinas.get(i).DarInfo();
                }
    }
    public boolean addOficinas(Oficina o){
    oficinas.add(o);        
    return true;
    }

    public int getNumOfi() {
        return numOfi;
    }

    public void setNumOfi(int numOfi) {
        this.numOfi = numOfi;
    }

    public double getAreaT() {
        return AreaT;
    }

    public void setAreaT(double AreaT) {
        this.AreaT = AreaT;
    }

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(ArrayList<Oficina> oficinas) {
        this.oficinas = oficinas;
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
