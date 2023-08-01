/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5_programacion2_evasalgado;

import java.awt.Color;

/**
 *
 * @author evaja
 */
public class pizarra {
    public int codigo;
    protected Color color;
    public pizarra() {

    }
    public pizarra(int cd, Color cl){
        this.codigo=cd;
        this.color=cl;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(int cd) {
        if (cd<=2000&&cd>1000) {
            this.codigo = cd;
        } else {
            System.out.println("Codigo invalido");
        }
        
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color cl) {
        this.color = cl;
        
    }
    @Override
    public String toString() {
        return "Datos de Pizzarra:\n " + "codigo de la pizzarra:" + codigo + "\ncolor de la pizzarra" + color;
    }
    
   
}
