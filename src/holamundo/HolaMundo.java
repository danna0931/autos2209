/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

/**
 *
 * @author dannapaola
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo Java!!");

        // Objeto creado apartir de la clase persona 
        // Objeto per1 
        Persona per1 = new Persona();
        per1.setNombre("Danna DC");
        System.out.println("Nombre per1:" + per1.getNombre());
        per1.comer("Molletes");

        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        System.out.println("Nombre per2:" + per2.getNombre());
        per2.comer("Pizza");
        System.out.println("");

        //
        System.out.println("Automovil");
        System.out.println("");
        // Bocho 
        Automovil bocho = new Automovil();
        // NOMBRE
        System.out.println("BOCHO");
        //Marca
        bocho.setMarca("VW");
        System.out.println("Marca: " + bocho.getMarca());
        //Submarca
        bocho.setSubMarca("Sedan");
        System.out.println("Marca: " + bocho.getSubMarca());
        //Modelo 
        bocho.setModelo(1970);
        System.out.println("Modelo: " + bocho.getModelo());
        //  Color 
        bocho.setColor(Color.BLUE);
        System.out.println("Color: " + bocho.getColor());
        System.out.println("");

        //Mustang
        Automovil mustang = new Automovil();
        // NOMBRE
        System.out.println("MUSTANG");
        //Marca 
        mustang.setMarca("Ford");
        System.out.println("Marca: " + mustang.getMarca());
        //Submarca
        mustang.setSubMarca("Mustang");
        System.out.println("Submarca: " + mustang.getSubMarca());
        //Modelo
        mustang.setModelo(2010);
        System.out.println("Modelo: " + mustang.getModelo());
        //Color
        mustang.setColor(Color.YELLOW);
        System.out.println("Color: " + mustang.getColor());
        System.out.println("");

        //Acura
        Automovil acura = new Automovil();
        //Nombre
        System.out.println("ACURA");
        //Marca
        acura.setMarca("Acura");
        System.out.println("Marca: " + acura.getMarca());
        //Submarca
        acura.setSubMarca("NSX");
        System.out.println("Submarca: " + acura.getSubMarca());
        //Modelo
        acura.setModelo(2013);
        System.out.println("Modelo: " + acura.getModelo());
        //Color
        acura.setColor(Color.GRAY);
        System.out.println("Color: " + acura.getColor());
    }

}
