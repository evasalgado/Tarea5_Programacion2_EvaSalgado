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
public class edificio {
    String nombre;
    private ArrayList<aula> Aula;
    
    public edificio(){
        
    }
    public edificio(String n){
        this.nombre=n;
    }
    public edificio(String n, ArrayList<aula> a){
        this.nombre=n;
        this.Aula=a;
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        if (n.equals("Edificio 1")||n.equals("Edificio 2")||n.equals("Edificio 3")||n.equals("Edificio 4")
                ||n.equals("Edificio 5")||n.equals("Edificio 6")||n.equals("CATI")||
                n.equals("Facultad de Ingenieria")) {
                this.nombre=n;
        } else {
            System.out.println("Edificio no existente");
        }
    }

    public ArrayList<aula> getAula() {
        return Aula;
    }

    public void setAula(ArrayList<aula> a) {
        if (a.isEmpty()) {
            System.out.println("No se han ingresado aulas");
        } else {
            this.Aula=a;
        }
    }

    @Override
    public String toString() {
        return "Datos de Edificio: \n" + "Nombre del edificio: " + nombre + "\nAulas dentro del edificio: " + Aula ;
    }
    
    
}
