/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5_programacion2_evasalgado;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JColorChooser;

/**
 *
 * @author evaja
 */
public class Tarea5_programacion2_EvaSalgado {

    /**
     * @param args the command line arguments
     */
    static ArrayList datosuni = new ArrayList();
    static Scanner leer = new Scanner(System.in);
    static Random alea = new Random();

    public static void main(String[] args) {
        // TODO code application logic here
        String user = " "; //Frank1804
        String password = " ";//FamS2362 
        System.out.println("Bienvenido, ingrese su nombre de usuario: ");
        user = leer.next();
        System.out.println("Ingrese su contrasenia: ");
        password = leer.next();
        if (!user.equals("Frank1804") && !password.equals("FamS2362")) {
            while (!user.equals("Frank1804") && !password.equals("FamS2362")) {
                System.out.println("Contrasenia o nombre de usuario incorrectos\n"
                        + "pruebe otra vez: ");
                System.out.println("Ingrese su nombre de usuario: ");
                user = leer.next();
                System.out.println("Ingrese su contrasenia: ");
                password = leer.next();
            }
        }

        System.out.println("\nBienvenido al sistema administrativo de unitec\n");
        int opcion = 0, opcion2 = 0;
        while (opcion != 5) {
            System.out.println("---MENU----\n"
                    + "1. Agregar Datos al sistema\n"
                    + "2. Listar informacion\n"
                    + "3. Modificar Informacion\n"
                    + "4. Eliminar Informacion\n"
                    + "5. Cerrar sesion");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    String universidad = "UNITEC";
                    System.out.println("Ingresa el dato que deseas aniadir primero:\n"
                            + "1. Agregar pizarra\n"
                            + "2. Agregar aula\n"
                            + "3. Agregar edificio\n"
                            + "4. Agregar campus\n");
                    opcion2 = leer.nextInt();
                    Agregardatos(opcion2);
                    break;
                case 2:
                    System.out.println("Datos Guardados: \n");
                    listar();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    opcion = 5;
                    System.out.println("Cerrando sesion...");
                    break;
                default:
                    System.out.println("Numero ingresado no es valido");
                    break;

            }
        }
    }

    public static void Agregardatos(int opcion) {
 
        int codigo = 0;
        Color color;
        switch (opcion) {
            case 1:
                codigo = alea.nextInt();
                color = Color.BLACK;
                datosuni.add( new pizarra(codigo, color));
                System.out.println("El codigo de la pizarra es:  " + codigo);
                
                break;
            case 2:
                int numeroclase = alea.nextInt();
                System.out.println("Aula Asignada: " + numeroclase);
                pizarra p = ((pizarra)datosuni.get(1));
                datosuni.add(new aula(numeroclase));
                break;
            case 3:
                System.out.println("Ingrese el nombre del edificio: ");
                String edificio = leer.nextLine();
                edificio = leer.nextLine();
                datosuni.add(new edificio(edificio));
                break;
            case 4:
                System.out.println("Ingrese en que tipo de campus se encuentra: [TGUS/SPS]: ");
                String campus = leer.next();
                datosuni.add(new campus(campus));
                break;
            case 5:
                String uni = "UNITEC";
                System.out.println("La universidad es" + uni);
                datosuni.add(new universidad(uni));
                break;
            default:
                System.out.println("Numero ingresado invalido");
        }

    }
    
    public static void modificar(){
        int posicion = 0;
        if (datosuni.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            listar();
            System.out.println("Ingrese lo que quiere modificar");
            posicion = leer.nextInt();
            if (posicion >= 0 && posicion < datosuni.size()) {
                if (datosuni.get(posicion) instanceof universidad || datosuni.get(posicion) instanceof campus
                        || datosuni.get(posicion) instanceof edificio) {
                    
        int codigo = 0;
        Color color;
        String universidad = "UNITEC";
                    System.out.println("Ingresa el dato que deseas aniadir primero:\n"
                            + "1. Agregar pizarra\n"
                            + "2. Agregar aula\n"
                            + "3. Agregar edificio\n"
                            + "4. Agregar campus\n");
                    int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                codigo = alea.nextInt();
                color = Color.BLACK;
               ((pizarra)datosuni.get(posicion)).setCodigo(codigo);
               ((pizarra)datosuni.get(posicion)).setCodigo(codigo);
                
                System.out.println("Datos ingresados correctamente");
                break;
            case 2:
                int numeroclase = alea.nextInt();
                System.out.println("Aula Asignada: " + numeroclase);
                pizarra p = ((pizarra)datosuni.get(posicion));
                ((aula)datosuni.get(posicion)).setNumero(numeroclase);
                ((aula)datosuni.get(posicion)).setP(p);
                System.out.println("Datos ingresados correctamente");
                break;
            case 3:
                System.out.println("Ingrese el nombre del edificio: ");
                String edificio = leer.nextLine();
                edificio = leer.nextLine();
                ((edificio)datosuni.get(posicion)).setNombre(edificio);
                break;
            case 4:
                System.out.println("Ingrese en que tipo de campus se encuentra: [TGUS/SPS]: ");
                String campus = leer.next();
                ((campus)datosuni.get(posicion)).setNombre(campus);
                break;
            case 5:
                String uni = "UNITEC";
                System.out.println("La universidad es" + uni);
                ((universidad)datosuni.get(posicion)).setNombre(uni);
                break;
            default:
                System.out.println("Numero ingresado invalido");
        }
                    System.out.println("Datos modificados perfectamente\n");
                } else {
                    System.out.println("Posicion Ingresada no es valida");
                }
            } else {
                System.out.println("Posicion Fuera de Rango");
            }
        }
    }
    public static void eliminar() {
        int posicion = 0;
        if (datosuni.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            listar();
            System.out.println("Ingrese lo que quiere eliminar");
            posicion = leer.nextInt();
            if (posicion >= 0 && posicion < datosuni.size()) {
                if (datosuni.get(posicion) instanceof universidad || datosuni.get(posicion) instanceof campus
                        || datosuni.get(posicion) instanceof edificio) {
                    datosuni.remove(posicion);
                    System.out.println("Datos eliminados perfectamente\n");
                } else {
                    System.out.println("Posicion Ingresada no es valida");
                }
            } else {
                System.out.println("Posicion Fuera de Rango");
            }
        }

    }

    public static void listar() {
        if (datosuni.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            for (Object dentrolista : datosuni) {
                if (dentrolista instanceof universidad || dentrolista instanceof campus || dentrolista instanceof edificio
                        || dentrolista instanceof aula || dentrolista instanceof pizarra) {
                    System.out.println(datosuni.indexOf(dentrolista) + "." + "\n");

                }
            }
        }

    }

}
