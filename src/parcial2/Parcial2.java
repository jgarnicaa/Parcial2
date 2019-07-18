/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import Modelo.Edificio;
import Modelo.Empresa;
import Modelo.LocalC;
import Modelo.Oficina;
import Modelo.Piso;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Empresa e= new Empresa("Inmobiliaria Las Acacias");
         File lista= new File("Guardar.txt");
        String tipo;
        Scanner input=new Scanner(lista);
        
        boolean arrendado;
        String descripcion;
        boolean ubicacion;
        String barrio;
        int estrato;
        double ValorA;
        double AreaC;
        while(input.hasNextLine()){
        String linea=input.nextLine();
        String[] partes = linea.split(";");
        tipo=partes[0];
        
        if( null != tipo)switch (tipo) {
                case "LocalC":
                    descripcion=partes[1];
                    ubicacion=Boolean.parseBoolean(partes[2]);
                    arrendado=Boolean.parseBoolean(partes[3]);
                    barrio=partes[4];
                    estrato=Integer.parseInt(partes[5]);
                    ValorA=Double.parseDouble(partes[6]);
                    AreaC=Double.parseDouble(partes[7]);
                    LocalC localN=new LocalC(descripcion,ubicacion,arrendado,barrio,estrato,ValorA,AreaC);
                    e.addInmueble(localN);
                    break;
                case "Oficina":
                    String t=partes[1];
                    arrendado=Boolean.parseBoolean(partes[2]);
                    barrio=partes[3];
                    estrato=Integer.parseInt(partes[4]);
                    ValorA=Double.parseDouble(partes[5]);
                    AreaC=Double.parseDouble(partes[6]);
                    Oficina OficinaN=new Oficina(t, arrendado,barrio,estrato,ValorA,AreaC);
                    e.addInmueble(OficinaN);
                    break;
                case "Piso":
                    int numO=Integer.parseInt(partes[1]);
                    double AreaT=Double.parseDouble(partes[2]);
                    barrio=partes[3];
                    estrato=Integer.parseInt(partes[4]);
                    ValorA=Double.parseDouble(partes[5]);
                    AreaC=Double.parseDouble(partes[6]);
                    Piso pisoN=new Piso(numO,AreaT,barrio,estrato,ValorA,AreaC);
                    for(int i=0; i<numO;i++){
                        String lineaN=input.nextLine();
                        String[] partest=lineaN.split(";");
                        Oficina o=new Oficina(partest[0], Boolean.parseBoolean(partest[1]), barrio, estrato, Double.parseDouble(partest[2]), Double.parseDouble(partest[3]));        
                        pisoN.addOficinas(o);
                    }
                    e.addInmueble(pisoN);
                    break;
                case "Edificio":
                    String nombreP=partes[1];
                    barrio=partes[2];
                    estrato=Integer.parseInt(partes[3]);
                    ValorA=Double.parseDouble(partes[4]);
                    AreaC=Double.parseDouble(partes[5]);
                    int numLo=Integer.parseInt(partes[6]);
                    int numPisos=Integer.parseInt(partes[7]);
                    Edificio ed=new Edificio(nombreP,barrio,estrato,ValorA,AreaC);
                    for(int q=0; q<numLo;q++){
                    String lineaN=input.nextLine();
                    String[] partest=lineaN.split(";");
                    LocalC l=new LocalC(partest[1],Boolean.parseBoolean(partest[2]),Boolean.parseBoolean(partest[3]),barrio,estrato,Double.parseDouble(partest[4]),Double.parseDouble(partest[5]));
                    ed.addLocal(l);
                    }
                    for(int p=0;p<numPisos;p++){
                       String lineaN=input.nextLine();
                       String[] partest=lineaN.split(";");
                    int numOf=Integer.parseInt(partest[1]);
                    double AreaTo=Double.parseDouble(partest[2]);
                    ValorA=Double.parseDouble(partest[3]);
                    AreaC=Double.parseDouble(partest[4]);
                    Piso piso=new Piso(numOf,AreaTo,barrio,estrato,ValorA,AreaC);
                    for(int i=0; i<numOf;i++){
                        String lineaNu=input.nextLine();
                        String[] partestm=lineaNu.split(";");
                        Oficina o=new Oficina(partestm[0], Boolean.parseBoolean(partestm[1]), barrio, estrato, Double.parseDouble(partestm[2]), Double.parseDouble(partestm[3]));        
                        piso.addOficinas(o);
                    }
                    ed.addPisos(piso);
                    }
                    e.addInmueble(ed);
                    break;
                default:
                    break;
            }
        
        
        }
        //metodo para obtener lista de inmuebles
        e.ListarInmueble();
        
    }
    
}
