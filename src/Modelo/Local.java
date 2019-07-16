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
public abstract class Local extends Inmueble {
    public boolean arrendado;

    public Local(boolean arrendado, String Barrio, int Estrato, double ValorA, double AreaC) {
        super(Barrio, Estrato, ValorA, AreaC);
        this.arrendado = arrendado;
    }


}
