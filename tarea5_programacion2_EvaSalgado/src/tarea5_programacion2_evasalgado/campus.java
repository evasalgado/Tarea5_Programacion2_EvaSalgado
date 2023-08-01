/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5_programacion2_evasalgado;

import java.util.ArrayList;

/**
 *
 * @author evaja
 */
public class campus {
    public String nombre;
    private ArrayList<edificio> Edificios;
    
    public campus(){
        
    }
    public campus(String n){
        this.nombre=n;
    }
    public campus(String n, ArrayList<edificio> e){
        this.nombre=n;
        this.Edificios=e;
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) { 
        if (n.equals("TGUS")||n.equals("SPS")) {
            this.nombre = n;
        } else {
            System.out.println("Campus ingresado no valido");
        }
    }

    public ArrayList<edificio> getEdificios() {
        return Edificios;
    }

    public void setEdificios(ArrayList<edificio> e) {
        if (e.isEmpty()) {
            System.out.println("Al parecer no hay edificios");
        } else {
            this.Edificios = Edificios;
        }
    } 

    @Override
    public String toString() {
        return "informacion del campus:\n" + "Campus:" + nombre + "\nEdificios dentro de el:" + Edificios;
    }
    
    
}
