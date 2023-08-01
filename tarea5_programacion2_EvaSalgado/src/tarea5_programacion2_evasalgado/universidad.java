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
public class universidad {
    public String nombre; 
    private ArrayList<campus> Campus;
    
    public universidad(){
        
    }
    public universidad(String n){
        this.nombre=n;
    }
    public universidad(String n, ArrayList<campus> c){
        this.nombre=n;
        this.Campus=c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        if (n.equals("UNITEC")||n.equals("Universidad Tecnologica Centroamerica")){
            this.nombre=n;
        } else {
            System.out.println("El campus ingresado no es valido");
        }
    }

    public ArrayList<campus> getCampus() {
        return Campus;
    }

    public void setCampus(ArrayList<campus> Campus) {
        this.Campus = Campus;
    }

    @Override
    public String toString() {
        return "Datos de la universidad:\n " + "nombre de la Universidad: " + nombre + "\nLocalización de Campus: " + Campus;
    }
    
    
}
