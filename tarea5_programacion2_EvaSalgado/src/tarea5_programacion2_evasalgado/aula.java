/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5_programacion2_evasalgado;

/**
 *
 * @author evaja
 */
public class aula {
    public int numero;
    private pizarra p;
    
    public aula(){
        
    }
    public aula(int num){
        this.numero=num;
    } 
    public aula(int num, pizarra p){
        this.numero=num;
        this.p=p;
    } 

    public int getNumero() {
        return numero;
    }

    public void setNumero(int num) {
        if (num<=604&num>100) {
            this.numero=num;
        }else{
            System.out.println("Numero de aula inexistente");
        }
    }

    public pizarra getP() {
        return p;
    }

    public void setP(pizarra p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Datos de aula:\n" + "Aula numero: " + numero + "\n" + p;
    }
    
    
}
